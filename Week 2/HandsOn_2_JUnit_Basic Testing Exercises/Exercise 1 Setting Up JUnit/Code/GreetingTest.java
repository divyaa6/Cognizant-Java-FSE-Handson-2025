package com.example.JunitDmeo;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingTest {
	@Test
    public void testSayHello() {
        Greeting g = new Greeting();
        assertEquals("Hello, Divya!", g.sayHello("Divya"));
    }
}
