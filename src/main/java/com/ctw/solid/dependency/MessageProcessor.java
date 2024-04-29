package com.ctw.solid.dependency;

public class MessageProcessor {

    private final MessageService messageService;

    // constructor-based dependency injection
    public MessageProcessor(MessageService messageService) {
        this.messageService = messageService;
    }

    public MessageProcessor(EmailService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String receiver){
        this.messageService.sendMessage(message, receiver);
    }
}
