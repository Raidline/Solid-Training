package com.ctw.solid.ocp.bad;

import com.ctw.solid.ocp.Event;
import com.ctw.solid.ocp.MessageEvent;
import com.ctw.solid.ocp.TeamsEvent;

public class EventEmitter {


    public Object emit(EventType type) {
        if (type == EventType.MSG) {
            return new MessageEvent("name of message event", -1, "hey there!", "Me", "You");
        }

        if (type == EventType.TEAMS) {
            return new TeamsEvent("name of the teams event", 3000, "This is a PR change, go see it!", "a chat");
        }

        return new Event("name of the event", 2020, "this an event about something");
    }


    public enum EventType {
        MSG,
        TEAMS
    }
}
