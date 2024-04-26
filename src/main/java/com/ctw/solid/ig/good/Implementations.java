package com.ctw.solid.ig.good;

public class Implementations {


    public class HumanWorker implements Workable, Eatable, Sleepable {

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


    public class RobotWorker implements Workable {

        @Override
        public void work() {
            System.out.println("working");
        }
    }
}
