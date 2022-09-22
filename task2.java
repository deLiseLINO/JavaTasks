import java.util.Scanner;
public class task2 {
    public static void main(String[] args){
        second_task();
    }
    public static void second_task(){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int firsts = (num%10);
        int seconds = (num/10)%10;
        int thirds = num/100;
        System.out.println(thirds+firsts+seconds);
    }
}
