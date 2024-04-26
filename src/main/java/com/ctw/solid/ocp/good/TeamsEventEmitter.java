package com.ctw.solid.ocp.good;

import com.ctw.solid.ocp.TeamsEvent;

public class TeamsEventEmitter extends EventEmitter<TeamsEvent> {

    @Override
    public TeamsEvent emit() {
        var base = super.emit();

        return new TeamsEvent(
                base.name(),
                base.value(),
                base.description(),
                "a chat i guess"
        );
    }
}
