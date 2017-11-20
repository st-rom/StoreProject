public class Privat24Payment implements PaymentStrategy{
    @Override
    public boolean pay(double price) {
        if (price <= 0) {
            System.out.println("Payment failed!");
            return false;
        }
        System.out.println("You've paid " + price + "$ with credit card");
        return true;
    }

}
