package lab2_2;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static List<Animal> animals = new ArrayList<>();
    static {
        animals.add(new Cat("Рыба ", "1"));
        animals.add(new Dog("Курица ", "2"));
        animals.add(new Horse("Каша ", "3"));
    }

    public static void main(String[] arg){
        Veterinarian veterinarian = new Veterinarian();
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}

