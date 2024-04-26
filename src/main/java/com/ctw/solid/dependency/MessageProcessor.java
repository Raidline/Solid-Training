package com.ctw.solid.dependency;

public class MessageProcessor {

    private final MessageService messageService;

    // constructor-based dependency injection
    public MessageProcessor(MessageService messageService) {
        this.messageService = messageService;
    }

    // no dependency injection, we would need to change this afterward
    public MessageProcessor() {
        this.messageService = new EmailService();
    }

    public void processMessage(String message, String receiver){
        // processing logic here
        this.messageService.sendMessage(message, receiver);
    }
}
