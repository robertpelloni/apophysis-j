package org.apophysis;

import org.junit.Test;
import static org.junit.Assert.*;

public class HeadlessRendererTargetTest {

    @Test
    public void testHeadlessRendererTarget() {
        HeadlessRendererTarget target = new HeadlessRendererTarget();
        assertFalse(target.isComplete());
        assertEquals(0.0, target.getProgress(), 0.001);

        target.progress(0.5);
        assertEquals(0.5, target.getProgress(), 0.001);

        target.message(Constants.WM_THREAD_COMPLETE);
        assertTrue(target.isComplete());
    }
}
