public class CartDecorator extends Cart{
    protected Cart cartToDecorate;
    public CartDecorator(Cart cart){
        cartToDecorate = cart;
    }
    @Override
    public void setPaymentStrategy(PaymentStrategy ps) {
        cartToDecorate.setPaymentStrategy(ps);
    }

    @Override
    public void setDeliveryStrategy(DeliveryStrategy ds) {
        cartToDecorate.setDeliveryStrategy(ds);
    }

    @Override
    public double computeTotalPrice() {
        return cartToDecorate.computeTotalPrice();
    }

    @Override
    public boolean ship() {
        cartToDecorate.ship();
        return true;
    }

    @Override
    public void addGun(Gun cg) {
        cartToDecorate.addGun(cg);
    }
}
