package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    private GHappy g;

    @BeforeEach
    public void initialize() {
        g = new GHappy();
    }

    @Test
    public void test_xxggxx(){
        boolean res = g.gHappy("xxggxx");
        Assertions.assertTrue(res);
    }

    @Test
    public void test_xxgxx(){
//        boolean res = g.gHappy("xxgxx");
        Assertions.assertFalse(g.gHappy("xxgxx"));
    }
    @Test
    public void test_xxggyygxx(){
//        boolean res = g.gHappy("xxggyygxx");
        Assertions.assertFalse(g.gHappy("xxggyygxx"));
    }

    @Test
    public void test_xxggyygggxx(){
//        boolean res = g.gHappy("xxggyygxx");
        Assertions.assertTrue(g.gHappy("xxggyygggxx"));
    }

    @Test
    public void test_g(){
//        boolean res = g.gHappy("xxggyygxx");
        Assertions.assertFalse(g.gHappy("g"));
    }

    @Test
    public void test_gg(){
//        boolean res = g.gHappy("xxggyygxx");
        Assertions.assertTrue(g.gHappy("gg"));
    }

    @Test
    public void test_xx(){
//        boolean res = g.gHappy("xxggyygxx");
        Assertions.assertTrue(g.gHappy("xx"));
    }
}
