package com.ctw.solid.single;

public class ExampleMapper {


    public OutputExample mapInputToOutput(InputExample in) {
        return new OutputExample(
                in.id,
                Math.round(in.value * in.percentage),
                in.name
        );
    }


    public record InputExample(String id, int value, float percentage, String name) {}

    public record OutputExample(String id, int discountedValue, String name) {}
}
