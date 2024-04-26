package com.ctw.solid.ig.bad;

public class Implementations {


    public class HumanWorker implements Worker {

        @Override
        public void work() {
            System.out.println("working");
        }

        @Override
        public void eat() {
            System.out.println("eating");
        }

        @Override
        public void sleep() {
            System.out.println("sleeping");
        }
    }


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
}
