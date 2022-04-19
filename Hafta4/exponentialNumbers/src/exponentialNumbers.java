import java.util.Scanner;

public class exponentialNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num ;

        System.out.print("Sınır sayısını giriniz : ");
        num = inp.nextInt();

        for (int i = 1, k=1; i <= num && k<=num; i *= 4, k*=5 ) {
            System.out.print(i+ " ");
            System.out.println(k);
        }
    }
}
