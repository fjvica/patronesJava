package com.patrones.patrones.creacional.builder;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Notification {

    private final String title;
    private final String message;
    private final boolean urgent;
    private final List<String> channels;      // Email, SMS, Push
    private final List<String> attachments;   // Archivos adjuntos
    private final String sender;

    private Notification(NotificationBuilder builder) {
        this.title = builder.title;
        this.message = builder.message;
        this.urgent = builder.urgent;
        this.channels = builder.channels;
        this.attachments = builder.attachments;
        this.sender = builder.sender;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", urgent=" + urgent +
                ", channels=" + channels +
                ", attachments=" + attachments +
                ", sender='" + sender + '\'' +
                '}';
    }

    // Builder estático
    public static class NotificationBuilder {
        private final String title;      // obligatorio
        private final String message;    // obligatorio
        private boolean urgent = false;  // opcional, default false
        private List<String> channels = new ArrayList<>();      // opcional
        private List<String> attachments = new ArrayList<>();   // opcional
        private String sender = "System";                      // opcional

        public NotificationBuilder(String title, String message) {
            this.title = title;
            this.message = message;
        }

        public NotificationBuilder urgent(boolean urgent) {
            this.urgent = urgent;
            return this;
        }

        public NotificationBuilder addChannel(String channel) {
            this.channels.add(channel);
            return this;
        }

        public NotificationBuilder addAttachment(String attachment) {
            this.attachments.add(attachment);
            return this;
        }

        public NotificationBuilder sender(String sender) {
            this.sender = sender;
            return this;
        }

        public Notification build() {
            // Validaciones antes de construir
            if (channels.isEmpty()) {
                channels.add("Email"); // Por defecto Email
            }
            return new Notification(this);
        }
    }
}


