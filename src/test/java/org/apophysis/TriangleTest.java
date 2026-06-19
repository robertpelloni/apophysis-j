package org.apophysis;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void testMove() {
        Triangle t = new Triangle(0, 0, 1, 0, 0, 1);
        t.move(2.0, 3.0);

        assertEquals(2.0, t.x[0], 0.0001);
        assertEquals(3.0, t.y[0], 0.0001);
        assertEquals(3.0, t.x[1], 0.0001);
        assertEquals(3.0, t.y[1], 0.0001);
        assertEquals(2.0, t.x[2], 0.0001);
        assertEquals(4.0, t.y[2], 0.0001);
    }

    @Test
    public void testFlip() {
        Triangle t = new Triangle(1, 2, 3, 4, 5, 6);
        t.flipHorizontal();
        assertEquals(-1.0, t.x[0], 0.0001);
        assertEquals(2.0, t.y[0], 0.0001);

        t.flipVertical();
        assertEquals(-1.0, t.x[0], 0.0001);
        assertEquals(-2.0, t.y[0], 0.0001);
    }
}
