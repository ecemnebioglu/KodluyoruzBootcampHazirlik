import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum=0;

        System.out.print("Bir sayı giriniz : ");
        num=sc.nextInt();

        for (int i=1; i<num; i++){
            if (num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println(num+ " Bir mükemmel sayıdır !");
        }else{
            System.out.println( num + " Bir mükemmel sayı değildir !");
        }
    }
}
