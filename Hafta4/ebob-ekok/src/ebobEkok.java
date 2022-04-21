import java.util.Scanner;
import java.lang.Math;

public class ebobEkok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, numMin;
        int ebob = 0;
        int ekok = 0;
        System.out.print("Birinci Sayıyı Giriniz : ");
        num1 = sc.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        num2 = sc.nextInt();

        numMin = Math.min(num1, num2);
        System.out.println("Küçük sayı : " + numMin);
        int i = numMin;
        while (i >= 1) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
                break;
            }
            i--;
        }
        System.out.println("EBOB : " + ebob);

        int k = 1;
        while (k <= num1 * num2) {
            if (k % num1 == 0 && k % num2 == 0) {
                ekok = k;
                break;
            }
            k++;
        }
        System.out.println("EKOK : " + ekok);
    }
}
