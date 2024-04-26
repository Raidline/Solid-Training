package com.ctw.solid.liskov;

public class Application {

    public static void main(String[] args) {

        send(new MessageEventEmitter());
        send(new TeamsEventEmitter());
    }


    private static <T> void send(EventEmitter<T> emitter) {
        var event = emitter.emit();

        System.out.println(event);
    }

    private static void sendBreakingPrinciple(MessageEventEmitter emitter) {
        var msgEvent = emitter.emit();

        System.out.println(msgEvent);
    }

    private static void sendBreakingPrinciple2(TeamsEventEmitter emitter) {
        var teamsEvent = emitter.emit();

        System.out.println(teamsEvent);
    }
}
