import java.util.List;

public class DeliveryNovaPoshta implements DeliveryStrategy {
    @Override
    public boolean deliver(List<Gun> a) {
        System.out.println("Delivering with Nova Poshta");
        return true;
    }

}
