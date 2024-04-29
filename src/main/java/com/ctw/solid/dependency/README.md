#  Dependency inversion Principle (DI)

_"Depend upon abstractions, [not] concretes."_

In other words, you should only have dependencies on abstractions (abstract classes and interfaces) and not concrete implementations.

You can take a look at the example in `MessageProcessor`.

You have two constructors there.

One that does receive a concrete implementation, and one that receives a `MessageService`.

The first constructor makes so that this class **only** works with the direct implementation of the `MessageService`, known as `EmailService`.

```java

public MessageProcessor(EmailService messageService) {
    this.messageService = messageService;
}
```

If we only have one type of message this can be fine, but what if we have two or three types of messages we want to send?

We would have to change the implementation because we no longer only want a `EmailService`.

The other constructor a dependency with the abstraction (`MessageService`), which makes this `MessageProcessor` save from possible future changes in the Message logic.

```java
public MessageProcessor(MessageService messageService) {
    this.messageService = messageService;
}
```
By doing this, even if we delete all the `MessageService` implementations and create 4 new ones the `MessageProcessor` does not care (nor should it!).
It just uses a `MessageService` to send messages.

You can also look at this by putting together multiple of the previous principles.

You have two challenges here:
- Identify the other principles involved here.
- Create your own examples for DI. (This is so that you can apply multiple principles all at once, see this as a final example.) 
