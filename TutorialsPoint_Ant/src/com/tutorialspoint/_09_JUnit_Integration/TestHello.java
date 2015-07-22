package com.tutorialspoint._09_JUnit_Integration;

import junit.framework.TestCase;

public class TestHello extends TestCase {

    public void testHello()
    {
        Hello h = new Hello();
        assertEquals(h.greet(), "Hello, world");
    }
}