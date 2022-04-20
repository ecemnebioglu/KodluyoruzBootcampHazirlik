import java.util.Scanner;

public class digitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int basValue;
        int result=0;

        System.out.print("Sayı Giriniz : ");
        number = sc.nextInt();

        int tempNumber=number;
        while (tempNumber!=0){
           basValue=tempNumber%10;
           result+=basValue;
           tempNumber/=10;
        }
        System.out.println(result);
    }
}
