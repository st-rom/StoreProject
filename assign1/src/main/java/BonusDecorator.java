public class BonusDecorator extends CartDecorator {
    public BonusDecorator(Cart cart) {
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
        return cartToDecorate.computeTotalPrice();
    }

    @Override
    public boolean ship() {
        cartToDecorate.addGun(new Gun("q123we",
                0, new GunSpec("c3po", Type.BLUNDERBUSS, Power.GODLY, 300)));
        return cartToDecorate.ship();
    }

    @Override
    public void addGun(Gun cg) {
        cartToDecorate.addGun(cg);
    }
}
