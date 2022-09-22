import java.util.Scanner;
public class task6 {
    public static void main(String[] args){
        sixth_task();
    }
    public static void sixth_task(){
        Scanner s = new Scanner(System.in);

        int num1 = s.nextInt();
        

        if (num1 > 0 && (num1 % 2 == 0)) 
            System.out.println("Положительное четное число");
        
        else if (num1 > 0 && (num1 % 2 != 0)) 
            System.out.println("Положительное нечетное число");
        
        else if (num1 < 0 && (num1 % 2 != 0)) 
            System.out.println("Отрицательное нечетное число");

        else if (num1 < 0 && (num1 % 2 == 0)) 
            System.out.println("Отрицательное четное число");
        
        

        
    }

}