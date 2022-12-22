package lab3;

public class Engine {
    private int power;
    private String vendor;

    public Engine(int power, String vendor) {
        this.power = power;
        this.vendor = vendor;
    }

    public int getPower() {
        return power;
    }

    public String getVendor() {
        return vendor;
    }
}
