package org.apophysis;

import org.junit.Test;
import static org.junit.Assert.*;

public class ApophysisTest {

    @Test
    public void testMainClassConstants() {
        assertEquals("apophysis-j", Constants.APPNAME);
        assertNotNull(Constants.VERSION);
    }
}
