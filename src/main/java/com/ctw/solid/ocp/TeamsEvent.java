package com.ctw.solid.ocp;

public record TeamsEvent(
        String name,
        int value,
        String description,
        String chat
) {
}
