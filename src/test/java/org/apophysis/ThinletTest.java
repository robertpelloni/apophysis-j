package org.apophysis;

import org.junit.Test;
import static org.junit.Assert.*;

public class ThinletTest {

    @Test
    public void testThinletInitialization() {
        com.thinlet.Thinlet thinlet = new com.thinlet.Thinlet();
        assertNotNull(thinlet);
        assertNotNull(thinlet.getDesktop());
    }
}
