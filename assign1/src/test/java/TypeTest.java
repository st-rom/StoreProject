import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TypeTest {
    private Type a;
    private Type b;
    private Type c;
    @Before
    public void setUp() throws Exception{
        a = Type.MUSKET;
        b = Type.BLUNDERBUSS;
        c = Type.ARQUEBUS;
    }
    @Test
    public void testOne() throws Exception {
        assertEquals("Musket", a.toString());
    }

    @Test
    public void testTwo() throws Exception {
        assertEquals("Blunderbuss", b.toString());
    }

    @Test
    public void testThree() throws Exception {
        assertEquals("Arquebus", c.toString());
    }

}