import java.util.Scanner;

public class maxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, num, max = 0, min = 0;
        System.out.print("Max ve min sayıların bulunması için kaç sayı gireceğinizi belirtiniz : ");
        N = sc.nextInt();

        int i =1;
        while(i<=N){
            System.out.print(i+". Sayıyı Giriniz : ");
            num=sc.nextInt();
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
            i++;
        }

        System.out.println("En Küçük Sayı: " + min);
        System.out.println("En Büyük Sayı : " + max);
    }
}
