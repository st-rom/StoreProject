import java.util.ArrayList;
import java.util.List;

public class Cart {
    protected PaymentStrategy ps;
    protected DeliveryStrategy ds;
    protected List<Gun> guns = new ArrayList<Gun>();

    public void setPaymentStrategy(PaymentStrategy ps){
        this.ps = ps;
    }

    public void setDeliveryStrategy(DeliveryStrategy ds){
        this.ds = ds;
    }

    public double computeTotalPrice(){
        int tp = 0;
        for(int i = 0; i < guns.size(); i++){
            tp += guns.get(i).getPrice();
        }
        return tp;
    }

    public boolean ship(){
        if (ps.pay(computeTotalPrice())){
            ds.deliver(guns);
            return true;
        }
        return false;
    }

    public void addGun(Gun g){
        guns.add(g);
    }
}
