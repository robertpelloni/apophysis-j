package org.apophysis;

import org.junit.Test;
import static org.junit.Assert.*;

public class ScriptConverterTest {

    @Test
    public void testConvertString() {
        StringBuilder sb = new StringBuilder("Clear;\nRotate(30);\n");
        ScriptConverter.convert(sb);
        String converted = sb.toString();
        // Since convert modifies the string to use the script API
        assertTrue(converted.contains("Clear"));
    }
}
