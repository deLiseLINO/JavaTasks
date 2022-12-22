package lab2_2;

public class Cat extends Animal{
    public Cat(String food, String location){
        super(food, location);
    }

    private double weight;

    @Override
    public void makeNoise() {
        System.out.println("Мяу");
    }

    @Override
    public void Eat() {
        System.out.println("Кот ест " + this.getFood());
    }
}