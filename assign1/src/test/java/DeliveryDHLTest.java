import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DeliveryDHLTest {
    private DeliveryDHL d;
    @Before
    public void setUp() throws Exception {
        d = new DeliveryDHL();
    }

    @Test
    public void deliver() throws Exception {
        assertEquals(true, d.deliver(new ArrayList<Gun>()));
    }

}