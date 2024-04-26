package com.ctw.solid.ocp.good;

import com.ctw.solid.ocp.MessageEvent;

public class MessageEventEmitter extends EventEmitter<MessageEvent> {


    @Override
    public MessageEvent emit() {
        var base = super.emit();

        return new MessageEvent(
                base.name(),
                base.value(),
                base.description(),
                "Me",
                "You"
        );
    }
}
