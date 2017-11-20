import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Privat24PaymentTest {
    private Privat24Payment p;
    @Before
    public void setUp() throws Exception {
        p = new Privat24Payment();
    }

    @Test
    public void pay() throws Exception {
        assertEquals(true, p.pay(1300));
    }

}