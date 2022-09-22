import java.util.Scanner;
public class task3 {
    public static void main(String[] args){
        third_task();
    }
    public static void third_task(){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num > 0){
        num++;
        }
        System.out.println(num);
    }
}