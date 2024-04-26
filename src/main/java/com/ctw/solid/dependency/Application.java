package com.ctw.solid.dependency;

public class Application {

    public static void main(String[] args) {
        MessageService messageService = new EmailService();
        MessageProcessor processor = new MessageProcessor(messageService);
        processor.processMessage("Hello", "john@example.com");
    }
}
