import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println(Arrays.toString(arr));

        System.out.print("Bir Sayı Giriniz : ");
        int num = sc.nextInt();

        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (i < num) {
                if (num - i < Math.abs(num - min)) {
                    min = i;
                }
            } else if (i > num) {
                if (Math.abs(num - i) < Math.abs(num - max)) {
                    max = i;
                }
            }
        }
        System.out.println("Girdiğiniz sayıya yakın en küçük sayı : " + min);
        System.out.println("Girdiğiniz sayıya yakın en büyük sayı : " + max);
    }
}
