public class Gun {
    private String serialNumber;
    private double price;
    private GunSpec spec;

    public Gun(String serialNumber, double price, GunSpec spec){
        this.spec = spec;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public String getSerialNumber(){
        return serialNumber;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public GunSpec getSpec(){
        return spec;
    }

    public String toString(){
        return serialNumber + price + spec;
    }
}
