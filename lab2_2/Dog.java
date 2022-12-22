package lab2_2;

public class Dog extends Animal{
    public Dog(String food, String location){
        super(food, location);
    }

    private String favouriteFood;

    @Override
    public void makeNoise() {
        System.out.println("Гав!");
    }

    @Override
    public void Eat() {
        System.out.println("Собака ест " + this.getFood());
    }
}
