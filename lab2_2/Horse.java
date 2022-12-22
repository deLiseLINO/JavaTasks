package lab2_2;

public class Horse extends Animal{
    public Horse(String food, String location){
        super(food, location);
    }

    private double stamina;

    @Override
    public void makeNoise() {
        System.out.println("Ииииго-го!");
    }

    @Override
    public void Eat() {
        System.out.println("Лошадь ест " + this.getFood());
    }
}
