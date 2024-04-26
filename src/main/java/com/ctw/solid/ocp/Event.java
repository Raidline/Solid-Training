package com.ctw.solid.ocp;

public record Event(
        String name,
        int value,
        String description
) {
}
