import org.junit.Test;

import static org.junit.Assert.*;

public class GunSpecTest {
    @Test
    public void getModel() throws Exception {
        GunSpec liked = new GunSpec("Military", Type.MUSKET, "over 9000", 22);
        assertEquals("Military", liked.getModel());
    }

    @Test
    public void getType() throws Exception {
        GunSpec liked = new GunSpec("Military", Type.BLUNDERBUSS, "over 5000", 225);
        assertEquals("Blunderbuss", liked.getType().toString());
    }

    @Test
    public void getPower() throws Exception {
        GunSpec liked = new GunSpec("Military", Type.BLUNDERBUSS, "over 9000", 225);
        assertEquals("over 9000", liked.getPower());
    }

    @Test
    public void getRange() throws Exception {
        GunSpec liked = new GunSpec("Military", Type.BLUNDERBUSS, "over 5000", 1100);
        assertEquals(1100.0, liked.getRange(), 1);
    }

}