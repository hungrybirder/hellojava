package io.hungrybirder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {

    @Test
    public void testCool() {
        assertEquals("cool", Hello.cool());
    }
}
