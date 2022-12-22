package lab3;

public class SportCar extends Car{
    private int maxSpeed;

    public SportCar(String vendor, String klass, String weight, Engine engine, int maxSpeed) {
        super(vendor, klass, weight, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    void start() {
        System.out.println("Спортивная машина поехала");
    }

    @Override
    void stop() {
        System.out.println("Спортивная машина остановилась");
    }

    @Override
    void printInfo() {
        System.out.println(
                "Марка " + this.getVendor() + "\n" +
                        "Класс: " + this.getKlass() + "\n" +
                        "Вес: " + this.getWeight() + "\n" +
                        "Грузоподъемность: " + this.maxSpeed + "\n" +
                        "Мотор: " + "\n\t |Мощность: " + this.getEngine().getPower()
                        + "\n\t |Производитель: " + this.getEngine().getVendor()
        );
    }
}
