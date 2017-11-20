import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class CartTest {
    private Cart cart;
    @Before
    public void setUp() throws Exception {
        cart = new Cart();
        cart.addGun(new Gun("kp67", 700, (new GunSpec("Military", Type.MUSKET,
                Power.GREAT, 2))));
        cart.addGun(new Gun("krp67", 900, (new GunSpec("Military", Type.MUSKET,
                Power.GODLY, 6))));
    }

    @Test
    public void setPaymentStrategy() throws Exception {
        cart.setPaymentStrategy(new Privat24Payment());
        assertEquals("Privat24Payment", cart.ps.getClass().getSimpleName());
    }

    @Test
    public void setDeliveryStrategy() throws Exception {
        cart.setDeliveryStrategy(new DeliveryDHL());
        assertEquals("DeliveryDHL", cart.ds.getClass().getSimpleName());
    }

    @Test
    public void computeTotalPrice() throws Exception {
        assertEquals(1600, cart.computeTotalPrice(), 2);
    }

    @Test
    public void ship() throws Exception {
        cart.setPaymentStrategy(new Privat24Payment());
        cart.setDeliveryStrategy(new DeliveryDHL());
        assertEquals(true, cart.ship());
    }

    @Test
    public void addGun() throws Exception {
        cart.addGun(new Gun("kr45p67", 1900, (new GunSpec("Military", Type.MUSKET,
                Power.GODLY, 16))));
        assertEquals(3, cart.guns.size());
    }

}