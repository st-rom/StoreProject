import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    private Customer c;
    @Before
    public void setUp() throws Exception{
        c = new Customer();
    }
    @Test
    public void testCustomer() throws Exception {
        assertEquals("Customer", c.getClass().getSimpleName());
    }

}