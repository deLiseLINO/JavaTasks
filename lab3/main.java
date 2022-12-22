package lab3;

public class main {
    public static void main (String[] arg){
        Engine sportEngine = new Engine(1200, "Ford");
        Engine standardEngine = new Engine(608, "Detroit Diesel");

        Car sport = new SportCar("Vortech: Ford Mustang GT", "C", "9750", standardEngine, 260);
        Car lorry = new Lorry("Freightliner Cascadia", "А", "2000", sportEngine, 27500);

        lorry.turnLeft();
        lorry.turnRight();
        lorry.start();
        lorry.stop();
        lorry.printInfo();

        System.out.println();

        sport.start();
        sport.stop();
        sport.printInfo();
    }
    }