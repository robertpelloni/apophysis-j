package org.apophysis;

import org.junit.Test;
import static org.junit.Assert.*;

public class RendererTest {

    @Test
    public void testRendererInit() {
        // Mock a thread target to avoid GUI coupling
        ThreadTarget dummyTarget = new ThreadTarget() {
            public void message(int msg) {}
            public void progress(double value) {}
            public void output(String msg) {}
        };

        Renderer renderer = new Renderer(dummyTarget);
        assertNotNull(renderer);
    }
}
