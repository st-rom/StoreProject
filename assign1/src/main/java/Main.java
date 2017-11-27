import java.util.List;

public class Main {
    public static void main(String[] args){
        GunStore store = new GunStore();
        GunSpec liked = new GunSpec("Military", Type.MUSKET, Power.GREAT, 2);
        initializeStore(store);
        List matched = store.search(liked);
        System.out.println("OOO" + matched);
        System.out.println(liked);
        System.out.println(store);
        if(!matched.isEmpty()){
            System.out.println("Check these:");
            for (Object aMatched : matched) {
                Gun gun = (Gun) aMatched;
                GunSpec spec = gun.getSpec();
                System.out.println("We have a " + spec.getModel() + " gun to shoot a lot of pe... emmm " +
                        "pigeons. It's power is " + spec.getPower() + "\nPrice: " + gun.getPrice() + "$");
            }
        }
        else{
            System.out.println("Sorry");
        }
        System.out.println(store.getGun("q123we"));
        System.out.println("----------------------------------");
        Cart cart = new Cart();
        cart.addGun(new Gun("kp67", 700, (new GunSpec("Military", Type.MUSKET,
                Power.GREAT, 2))));
        cart.addGun(new Gun("krp67", 900, (new GunSpec("Military", Type.MUSKET,
                Power.GODLY, 6))));
        System.out.println(cart.computeTotalPrice());
        cart.setPaymentStrategy(new Privat24Payment());
        cart.setDeliveryStrategy(new DeliveryDHL());
        System.out.println(cart.ship());
        cart.notifyObservers();
    }

    private static void initializeStore(GunStore store){
        store.addGun("q123we", "da21", Type.BLUNDERBUSS, Power.GODLY, 300, 9000);
        store.addGun("mf8873", "d14d", Type.ARQUEBUS, Power.LOW, 150, 45000);
        store.addGun("re3123t", "lf32", Type.BLUNDERBUSS, Power.NORMAL, 400, 3000);
        store.addGun("HU1h14", "Military", Type.MUSKET, Power.GREAT, 2, 3000);
    }
}
