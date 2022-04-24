import java.util.Scanner;

public class PrimeNumbers {
    static void primeNumber(int n) {

        if (n==1) System.out.println(n + " bir asal sayı değildir.");
        else if (n==2||n==3||n==5||n==7) System.out.println(n+ " bir asal sayıdır");
        else if (n%2==0 || n%3==0||n%5==0||n%7==0) System.out.println(n+ " bir asal sayı değildir.");
        else System.out.println(n + " bir asal sayıdır");
    }
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Programdan çıkmak için '0' giriniz");
        do {
            System.out.print("Asal sayı olup olmadığının kontrol edilmesi için bir sayı giriniz : ");
             num = sc.nextInt();
            primeNumber(num);
        }while (num!=0);

    }
}
