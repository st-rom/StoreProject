public class GunSpec {
    private String model;
    private Power power;
    private Type type;
    private double range;

    public GunSpec(String model, Type type, Power power, double range){
        this.model = model;
        this.type = type;
        this.power = power;
        this.range = range;
    }

    public String getModel(){
        return model;
    }

    public Type getType(){
        return type;
    }

    public Power getPower(){
        return power;
    }

    public double getRange(){
        return range;
    }

    public String toString(){
        return model + type + power + range;
    }
}
