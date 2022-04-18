import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int num, sum = 0, counter = 0;
        double div;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        num = inp.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                counter += 1;
            }
        }
        div=sum/counter;
        System.out.println("Bulunan sayıların ortalaması : " + sum + " / " + counter + " = " + div );
    }
}
