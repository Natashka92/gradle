package com.hello;

import org.joda.time.LocalTime;


public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());

        Simple simple = new Simple();
        simple.setValue(10);
        System.out.println("Value from Simple: " + simple.getValue());
    }
}
