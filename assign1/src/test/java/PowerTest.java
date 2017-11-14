import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {
    private Power a;
    private Power b;
    private Power c;
    @Before
    public void setUp() throws Exception {
        a = Power.LOW;
        b = Power.GREAT;
        c = Power.GODLY;
    }

    @Test
    public void testOne() throws Exception {
        assertEquals("Low", a.toString());
    }

    @Test
    public void testTwo() throws Exception {
        assertEquals("Great", b.toString());
    }

    @Test
    public void testThree() throws Exception {
        assertEquals("Godly", c.toString());
    }

}