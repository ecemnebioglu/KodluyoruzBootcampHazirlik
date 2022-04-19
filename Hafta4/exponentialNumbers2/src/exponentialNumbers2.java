import java.util.Scanner;

public class exponentialNumbers2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b,c=1;

        System.out.print("Üssü alınacak sayı : ");
        a = inp.nextInt();
        System.out.print("Üs olacak sayı : ");
        b=inp.nextInt();

        for(int i=1; i<=b; i++){
          c*=a;
        }
        System.out.println("Cevap : " + c);
    }
}
