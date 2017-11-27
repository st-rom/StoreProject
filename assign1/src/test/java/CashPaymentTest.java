import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashPaymentTest {
    private CashPayment c;
    @Before
    public void setUp() throws Exception {
        c = new CashPayment();
    }

    @Test
    public void pay() throws Exception {
        assertEquals(true, c.pay(1300));
    }

    @Test
    public void pay2() throws Exception {
        assertEquals(false, c.pay(0));
    }
}