# Single Responsibility Pattern (SRP)

_"There should never be more than one reason for a class to change."_

In other words, every class should have only one responsibility.

You can take a look at the example in `ExampleMapper`.

```java
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
```

The mapper is (probably) the smallest responsibility possible. It only has to do one thing **map things**.

You should look at this implementation and understand how there are no need for external dependencies not external calls,
there is an input and an output. (1-1 relation)

In the `bad` package, you can see a bad _mapper_ implementation, as it also performs an HTTP call.

```java
public class UserMapper {

    private final UserAPI api = new UserAPI();

    public UserService.UserResponse mapUser(String name) {
        var user = this.api.findUserByName(name);

        return new UserService.UserResponse(user.name(), user.lastName(), user.age());
    }

}
```

Your challenge is to make this mapper respect the SRP.

_A possible resolution is in the `good` package_.

[Base Readme](src/main/java/com/ctw/solid)
