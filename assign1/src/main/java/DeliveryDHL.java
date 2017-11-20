import java.util.List;

public class DeliveryDHL implements DeliveryStrategy {
    @Override
    public boolean deliver(List<Gun> a) {
        System.out.println("Delivering with DHL");
        return true;
    }

}
