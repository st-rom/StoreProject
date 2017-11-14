import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GunTest {
    private Gun gun;
    private GunSpec spec;

    @Before
    public void setUp() throws Exception {
        spec = new GunSpec("Military", Type.BLUNDERBUSS, Power.LOW, 225);
        gun = new Gun("AC12POK", 3300, spec);
        System.out.println("Before");
    }

    @Test
    public void getSerialNumber() throws Exception {
        assertEquals("AC12POK", gun.getSerialNumber());
    }

    @Test
    public void getPrice() throws Exception {
        assertEquals(3300, gun.getPrice(), 1);
    }

    @Test
    public void setPrice() throws Exception {
        gun.setPrice(3700);
        assertEquals(3700, gun.getPrice(), 1);
    }

    @Test
    public void getSpec() throws Exception {
        assertEquals("MilitaryBlunderbussLow225.0", gun.getSpec().toString());
    }

    @Test
    public void testString() throws Exception {
        assertEquals("AC12POK3300.0MilitaryBlunderbussLow225.0", gun.toString());
    }
}
