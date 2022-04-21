import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int l = 1; l <= (n - 1); l++) {
            for (int m = 1; m <= l; m++) {
                System.out.print(" ");
            }
            for (int r = l; r < (n - 1); r++) {
                System.out.print("*");
            }
            for (int o = l; o <= (n - 1); o++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
