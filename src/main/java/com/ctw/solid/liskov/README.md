# Liskov substitution principle (Liskov)

_"Functions that use pointers or references to base classes must be able to use objects of derived classes without
knowing it."_

In other words, as a client of some code you should be able to have a reference to a base object and use it not needing
to care about the multiple possible implementations.

We will continue the logic of the previous principle (OCP), as both can be seen correlated.

You can take a look at the example in `Application`.

This _application_ wants to send multiple types of events. So we define a method that would take a
generic `EventEmmiter<T>` and send said event.

```java
private static <T> void send(EventEmitter<T> emitter) {
    var event = emitter.emit();

    System.out.println(event);
}
```

Since both `MessageEventEmitter` and `TeamsEventEmitter` extend `EventEmitter<T>` we can call the function with either
of them.

```java
public class MessageEventEmitter extends EventEmitter<MessageEvent> {...}
```

```java
public class TeamsEventEmitter extends EventEmitter<MessageEvent> {...}
```

The function in case (`send`) does not need to know what type of event is sending, it just cares about sending an event.

Your challenge is to create an example of your own.
In this section we don't have a specific example, as it is important for you to create a well drafted hierarchy and be
able to use it with ease.
