package com.example.AssertTest;
import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;

public class AssertionsTest extends TestCase {
	@Test
    public void testAssertions() {
        assertEquals(5, 2 + 3);
        assertTrue(5 > 3);
        assertFalse(5 < 3);
        assertNull(null);
        assertNotNull(new Object());
    }

}
