package com.example.JunitDmeo;

public class Greeting {
    public String sayHello(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Hello, Stranger!";
        }
        return "Hello, " + name + "!";
    }
}
