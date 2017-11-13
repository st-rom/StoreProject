import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class GunStore {
    private List<Gun> guns;

    public GunStore() {
        guns = new LinkedList<>();
    }

    public void addGun(String serialNumber, String model, Type type, Power power, double range, double price) {
        GunSpec spec = new GunSpec(model, type, power, range);
        Gun gun = new Gun(serialNumber, price, spec);
        guns.add(gun);
    }

    public Gun getGun(String serialNumber) {
        for (Object gun1 : guns) {
            Gun gun = (Gun) gun1;
            if (gun.getSerialNumber().equals(serialNumber)) {
                return gun;
            }
        }
        return null;
    }

    public List search(GunSpec searchSpec) {
        List<Gun> mg = new LinkedList<>();
        for (Gun gun : guns) {
            GunSpec gspec = gun.getSpec();
            String model = searchSpec.getModel().toLowerCase();
            if (!model.equals("") && !model.equals(gspec.getModel().toLowerCase())) {
                continue;
            }
            if (searchSpec.getType() != gspec.getType()) {
                continue;
            }
            if (searchSpec.getPower() !=  gspec.getPower()) {
                continue;
            }
            if (searchSpec.getRange() != gspec.getRange()) {
                continue;
            }
            mg.add(gun);
        }
        return mg;
    }

    public String toString(){
        String s = "";
        for (Gun gun : guns) {
            s += gun + "_/_";
        }
        return s;
    }


}
