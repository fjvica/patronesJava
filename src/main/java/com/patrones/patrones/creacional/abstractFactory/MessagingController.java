package com.patrones.patrones.creacional.abstractFactory;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/messaging")
public class MessagingController {

    private final MessagingService messagingService;

    public MessagingController(MessagingService messagingService) {
        this.messagingService = messagingService;
    }

    @GetMapping("/test")
    public String test() {
        messagingService.process();
        return "Mensajería procesada correctamente";
    }
}

