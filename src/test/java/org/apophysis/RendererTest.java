package org.apophysis;

import org.junit.Test;
import static org.junit.Assert.*;

public class RendererTest {

    @Test
    public void testRendererInit() {
        // Use the newly created headless target instead of a local mock
        HeadlessRendererTarget target = new HeadlessRendererTarget();

        Renderer renderer = new Renderer(target);
        assertNotNull(renderer);
    }
}
