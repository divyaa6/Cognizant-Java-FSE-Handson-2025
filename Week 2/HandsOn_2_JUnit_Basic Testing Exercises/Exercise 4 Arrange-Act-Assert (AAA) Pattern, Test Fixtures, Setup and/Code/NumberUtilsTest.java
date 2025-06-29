package com.example.AAAPattern;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class NumberUtilsTest {

	NumberUtils utils;

    @Before
    public void setUp() {
        utils = new NumberUtils();
    }

    @After
    public void tearDown() {
        utils = null;
    }

    @Test
    public void testEvenNumber() {
        int input = 10;
        boolean result = utils.isEven(input);
        assertTrue(result);
    }

    @Test
    public void testOddNumber() {
        int input = 5;
        boolean result = utils.isEven(input);
        assertFalse(result);
    }

}
