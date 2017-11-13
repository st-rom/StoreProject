import org.junit.Test;

import static org.junit.Assert.*;

public class GunSpecTest {
    @Test
    public void getModel() throws Exception {
        GunSpec liked = new GunSpec("Military", Type.MUSKET, Power.LOW, 22);
        assertEquals("Military", liked.getModel());
    }

    @Test
    public void getType() throws Exception {
        GunSpec liked = new GunSpec("Military", Type.BLUNDERBUSS, Power.GREAT, 225);
        assertEquals("Blunderbuss", liked.getType().toString());
    }

    @Test
    public void getPower() throws Exception {
        GunSpec liked = new GunSpec("Military", Type.BLUNDERBUSS, Power.NORMAL, 225);
        assertEquals("Normal", liked.getPower().toString());
    }

    @Test
    public void getRange() throws Exception {
        GunSpec liked = new GunSpec("Military", Type.BLUNDERBUSS, Power.LOW, 1100);
        assertEquals(1100.0, liked.getRange(), 1);
    }

}
