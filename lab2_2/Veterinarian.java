package lab2_2;

public class Veterinarian {
    public void treatAnimal(Animal animal){
        System.out.println("Еда: " + animal.getFood()
                + "Расположение: " + animal.getLocation());
    }
}
