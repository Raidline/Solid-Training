package com.ctw.solid.ocp;

public record MessageEvent(
        String name,
        int value,
        String description,
        String sender,
        String receiver
) {
}
