import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       int num ;

        System.out.print("Bir sayı giriniz : ");
        num = inp.nextInt();

        for(int i = 1; i<=num; i++){
            if (i%5==0 && i%4==0){
                System.out.println(i);
            }
        }
    }
}
