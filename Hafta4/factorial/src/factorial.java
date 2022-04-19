import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int num, sum=1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Faktöriyeli Hesaplanacak Sayıyı Giriniz : ");
        num = inp.nextInt();

        for (int i =1; i<=num ; i++){
           sum=sum*i;
        }
        System.out.println(num + "! = "+ sum);
    }
}
