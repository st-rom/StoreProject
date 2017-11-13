public class GunSpec {
    private String model, power;
    private Type type;
    private double range;

    public GunSpec(String model, Type type, String power, double range){
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

    public String getPower(){
        return power;
    }

    public double getRange(){
        return range;
    }

    public String toString(){
        return model + type + power + range;
    }
}
