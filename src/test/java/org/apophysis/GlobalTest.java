package org.apophysis;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class GlobalTest {

    @BeforeClass
    public static void setUp() {
        Global.randomGenerator = new java.util.Random();
    }

    @Test
    public void testRandom() {
        double r = Global.random();
        assertTrue("Random number should be >= 0.0", r >= 0.0);
        assertTrue("Random number should be < 1.0", r < 1.0);
    }
}
