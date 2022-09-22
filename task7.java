import java.util.Scanner;
public class task7 {
    public static void main(String[] args){
        seventh_task();
    }
    public static void seventh_task(){
        Scanner s = new Scanner(System.in);

        int num1 = s.nextInt();
        double MO = 4.15;
        double RO = 1.98;
        double KR = 2.69;
        double KI = 5.00;

        if (num1 == 905) 
            System.out.println(MO * 10);
        
        else if (num1 == 194) 
            System.out.println(RO * 10);
        
        else if (num1 == 491) 
            System.out.println(KR * 10);

        else if (num1 == 800) 
            System.out.println(KI * 10);
        
        

        
    }

}