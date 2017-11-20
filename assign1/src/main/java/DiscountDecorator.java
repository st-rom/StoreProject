public class DiscountDecorator extends CartDecorator {
    public DiscountDecorator(Cart cart){
        super(cart);
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
        return cartToDecorate.computeTotalPrice() * 0.9;
    }

    @Override
    public boolean ship() {
        return cartToDecorate.ship();

    }

    @Override
    public void addGun(Gun cg) {
        cartToDecorate.addGun(cg);
    }

}
