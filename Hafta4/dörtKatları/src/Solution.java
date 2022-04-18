import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k , sum=0;

        do {
            System.out.print("Bir Sayı Giriniz : ");
            k = inp.nextInt();
            if (k%2==0 && k%4==0){
                sum +=k;
            }
        } while (k % 2 == 0);
        System.out.println("Toplam : "+ sum);
    }
}
