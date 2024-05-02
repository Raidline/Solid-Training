package com.ctw.solid.ocp.good;

import com.ctw.solid.ocp.Event;
import com.ctw.solid.ocp.MessageEvent;
import com.ctw.solid.ocp.TeamsEvent;

public class EventEmitter<T> {

    public T emit() {
        return (T) new Event("name of the event", 2020, "this an event about something");
    }
}
