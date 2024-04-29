#  Interface segregation principle (IG)

_"Clients should not be forced to depend upon interfaces that they do not use."_

In other words, the interfaces should be as small as possible so that any class that implements the interfaces is not forced to make logic that it does not need.


You can take a look at the example in `Implementations`, inside the `bad` package.

These _implementations_ want to execute multiple types of actions depending on the worker.

In here you can see that the interface Worker has 3 methods defined on the contract.

```java
public interface Worker {
    void work();
    void eat();
    void sleep();
}
```

As a _human_ worker, you would expect that all of this applies. But if you have a _robot_ worker eat and sleep (in this case) do not apply.

So as a robot worker implementation we are forced to state why we are not implementing something.

```java
public class RobotWorker implements Worker {

        @Override
        public void work() {
            System.out.println("working");
        }

        @Override
        public void eat() {
            // not needed
        }

        @Override
        public void sleep() {
            // not needed
        }
    }
```

This can lead to unexpected behaviour as we might call the method `eat` from the `RobotWorker` and we would have no idea that the method does nothing (in this case).
In a worst case scenario it can even throw an exception!

Your challenge is to make this interface respect the IG principle.

_A possible solution can be found in the `good`package.
