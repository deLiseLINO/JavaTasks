package lab3;
public abstract class Car {
    private String vendor;
    private String klass;
    private String weight;
    private Engine engine;

    public Car(String vendor, String klass, String weight, Engine engine) {
        this.vendor = vendor;
        this.klass = klass;
        this.weight = weight;
        this.engine = engine;
    }
    abstract void start();
    abstract void stop();
    abstract void printInfo();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public String getVendor() {
        return vendor;
    }

    public String getKlass() {
        return klass;
    }

    public String getWeight() {
        return weight;
    }

    public Engine getEngine() {
        return engine;
    }
}
