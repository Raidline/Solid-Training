# Open-Closed Principle (OCP)

_"Software entities ... should be open for extension, but closed for modification."_

In other words, you should be able to take a class and add behaviour without modifications on the base code. 

You can take a look at the example in `ExampleEventEmmiter`.

This _emmiter_ is just emitting an event. You could imagine that this could easily be extendable.

By creating an implementation of this class we could create multiple types of messages.
You could even that the base message and add new behaviour to it.

This is all possible by extending the `ExampleEventEmmiter` class and add whatever behaviour we want.

In the `bad` package, you can see a bad _emitter_ implementation, as the code is filled with *if's* statements to send different types of messages.

You would need to send two types of messages (as it can be seen in the bad implementation):
 - Message
 - Teams chat

Your challenge is to make this mapper respect the OCP.

_A possible resolution is in the `good` package_.
