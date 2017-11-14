import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {
    private Power aa;
    private Power bb;
    private Power cc;
    @Before
    public void setUp() throws Exception {
        aa = Power.LOW;
        bb = Power.GREAT;
        cc = Power.GODLY;
    }

    @Test
    public void testOne() throws Exception {
        assertEquals("Low", aa.toString());
    }

    @Test
    public void testTwo() throws Exception {
        assertEquals("Great", bb.toString());
    }

    @Test
    public void testThree() throws Exception {
        assertEquals("Godly", cc.toString());
    }

}
