import org.junit.Test;

import static org.junit.Assert.*;

public class GunTest {
    @Test
    public void getSerialNumber() throws Exception {
        GunSpec spec = new GunSpec("Military", Type.BLUNDERBUSS, Power.LOW, 225);
        Gun gun = new Gun("AC12POK", 3300, spec);
        assertEquals("AC12POK", gun.getSerialNumber());
    }

    @Test
    public void getPrice() throws Exception {
        GunSpec spec = new GunSpec("Military", Type.BLUNDERBUSS, Power.LOW, 225);
        Gun gun = new Gun("AC12POK", 3300, spec);
        assertEquals(3300, gun.getPrice(), 1);
    }

    @Test
    public void setPrice() throws Exception {
        GunSpec spec = new GunSpec("Military", Type.BLUNDERBUSS, Power.NORMAL, 225);
        Gun gun = new Gun("AC12POK", 3300, spec);
        gun.setPrice(3700);
        assertEquals(3700, gun.getPrice(), 1);
    }

    @Test
    public void getSpec() throws Exception {
        GunSpec spec = new GunSpec("Military", Type.BLUNDERBUSS, Power.NORMAL, 225);
        Gun gun = new Gun("AC12POK", 3300, spec);
        assertEquals("MilitaryBlunderbussNormal225.0", gun.getSpec().toString());
    }

}
