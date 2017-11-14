import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GunSpecTest {
    private GunSpec liked;
    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
        liked = new GunSpec("Military", Type.MUSKET, Power.LOW, 22);
    }

    @Test
    public void getModel() throws Exception {
        assertEquals("Military", liked.getModel());
    }

    @Test
    public void getType() throws Exception {
        assertEquals("Musket", liked.getType().toString());
    }

    @Test
    public void getPower() throws Exception {
        assertEquals("Low", liked.getPower().toString());
    }

    @Test
    public void getRange() throws Exception {
        assertEquals(22.0, liked.getRange(), 1);
    }

    @Test
    public void testString() throws Exception {
        assertEquals("MilitaryMusketLow22.0", liked.toString());
    }

}
