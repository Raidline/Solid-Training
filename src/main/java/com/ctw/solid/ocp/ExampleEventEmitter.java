package com.ctw.solid.ocp;

public class ExampleEventEmitter {


    public Event emit() {
        return new Event("name of the event", 2020, "this an event about something");
    }
}
