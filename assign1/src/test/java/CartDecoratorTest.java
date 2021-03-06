import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CartDecoratorTest {
    private CartDecorator cart;
    @Before
    public void setUp() throws Exception {
        Cart c = new Cart();
        cart = new CartDecorator(new Cart());
    }

    @Test
    public void setPaymentStrategy() throws Exception {
        cart.setPaymentStrategy(new Privat24Payment());
        assertEquals("Privat24Payment", cart.cartToDecorate.ps.getClass().getSimpleName());
    }

    @Test
    public void setDeliveryStrategy() throws Exception {
        cart.setDeliveryStrategy(new DeliveryDHL());
        assertEquals("DeliveryDHL", cart.cartToDecorate.ds.getClass().getSimpleName());
    }

    @Test
    public void computeTotalPrice() throws Exception {
        cart.addGun(new Gun("kr45p67", 1900, (new GunSpec("Military", Type.MUSKET,
                Power.GODLY, 16))));
        assertEquals(1900, cart.computeTotalPrice(), 2);
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
        assertEquals(1, cart.cartToDecorate.guns.size());
    }
}