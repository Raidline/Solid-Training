package com.ctw.solid.ocp.bad;

import com.ctw.solid.ocp.MessageEvent;

public class Main {

    public static void main(String[] args) {
        var event = new EventEmitter().emit(EventEmitter.EventType.MSG);

        System.out.println(((MessageEvent) event).sender());
    }
}
