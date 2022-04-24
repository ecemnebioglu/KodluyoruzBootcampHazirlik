import java.util.Scanner;
public class ExponentialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pow, sub, result=1;

        System.out.print("Üssü alınacak sayıyı giriniz : ");
        sub = sc.nextInt();
        System.out.print("Üs değerini giriniz : ");
        pow = sc.nextInt();

        for(int i=1; i<=pow; i++){
            result*=sub;
        }
        System.out.println("Sonuç : "+result);
    }
}
