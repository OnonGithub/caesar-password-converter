package org.dingco.encryption;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChiperTest {
    @Test
    void testingEncryption() {
        Assertions.assertEquals("C", Chiper.decrypt("C", 2));
    }
}
