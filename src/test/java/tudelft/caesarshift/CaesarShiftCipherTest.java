package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    private CaesarShiftCipher csc;

    @BeforeEach
    public void initialize() {
        csc = new CaesarShiftCipher();
    }

    @Test
    public void test_0_b() {
        String res = csc.CaesarShiftCipher("b", 0);
        Assertions.assertEquals("b", res);
    }

    @Test
    public void test_3_abc() {
        String res = csc.CaesarShiftCipher("abc", 3);
        Assertions.assertEquals("def", res);
    }

    @Test
    public void test_3_xyz() {
        String res = csc.CaesarShiftCipher("xyz", 3);
        Assertions.assertEquals("abc", res);
    }
    @Test
    public void test_0_abc() {
        String res = csc.CaesarShiftCipher("abc", 0);
        Assertions.assertEquals("abc", res);
    }
    @Test
    public void test_1_abc() {
        String res = csc.CaesarShiftCipher("abc", 1);
        Assertions.assertEquals("bcd", res);
    }
    @Test
    public void test_1_xyz() {
        String res = csc.CaesarShiftCipher("xyz", 1);
        Assertions.assertEquals("yza", res);
    }

}
