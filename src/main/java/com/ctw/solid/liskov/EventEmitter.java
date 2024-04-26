package com.ctw.solid.liskov;

import com.ctw.solid.ocp.Event;

public abstract class EventEmitter<T> {

    public T emit() {
        return (T) new Event("name of the event", 2020, "this an event about something");
    }
}
