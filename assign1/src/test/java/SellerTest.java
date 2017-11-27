import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SellerTest {
    private Seller s;
    @Before
    public void setUp() throws Exception{
        s = new Seller();
    }
    @Test
    public void testSeller() throws Exception {
        assertEquals("Seller", s.getClass().getSimpleName());
    }

}