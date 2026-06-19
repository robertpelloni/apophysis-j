package org.apophysis;

import org.apophysis.variations.BlobVariation;
import org.junit.Test;
import static org.junit.Assert.*;

public class VariationTest {

    @Test
    public void testBlobVariation() {
        BlobVariation blob = new BlobVariation();

        // Assert initial parameter names and lengths
        assertEquals("blob", blob.getName());
        assertEquals(3, blob.getNrParameters());
        assertEquals("blob_low", blob.getParameterName(0));

        // Assert default params (flow, fhigh, fwaves) exist
        assertFalse(Double.isNaN(blob.getParameterValue(0)));
        assertFalse(Double.isNaN(blob.getParameterValue(1)));
        assertFalse(Double.isNaN(blob.getParameterValue(2)));

        // Test setter
        blob.setParameterValue(0, 0.5);
        assertEquals(0.5, blob.getParameterValue(0), 0.0001);
    }
}
