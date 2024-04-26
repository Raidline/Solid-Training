package com.ctw.solid.ocp.good;

public class Main {

    public static void main(String[] args) {

        var event = new MessageEventEmitter().emit();

        System.out.println(event.sender());

        var teamsEvent = new TeamsEventEmitter().emit();

        System.out.println(teamsEvent.chat());
    }
}
