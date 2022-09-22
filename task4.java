import java.util.Scanner;
public class task4 {
    public static void main(String[] args){
        fourth_task();
    }
    public static void fourth_task(){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num > 0){
        num++;}
        else if (num < 0){
        num = num - 2;}
        else if (num == 0){
        num = 10;}
        
        System.out.println(num);
    }
}