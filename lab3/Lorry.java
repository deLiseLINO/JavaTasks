package lab3;

public class Lorry extends Car {

    private int loadCapacity;

    public Lorry(String vendor, String klass, String weight, Engine engine, int loadCapacity) {
        super(vendor, klass, weight, engine);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void start() {
        System.out.println("Грузовик поехал ");
    }

    @Override
    void stop() {
        System.out.println("Грузовик остановился ");
    }

    @Override
    void printInfo() {
        System.out.println(
                "Марка " + this.getVendor() + "\n" +
                        "Класс: " + this.getKlass() + "\n" +
                        "Вес: " + this.getWeight() + "\n" +
                        "Грузоподъемность: " + this.loadCapacity + "\n" +
                        "Мотор: " + "\n\t |Мощность: " + this.getEngine().getPower()
                        + "\n\t |Производитель: " + this.getEngine().getVendor()
        );
    }
}