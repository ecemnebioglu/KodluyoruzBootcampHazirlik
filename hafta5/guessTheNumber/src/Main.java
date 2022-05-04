import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int randomNum = random.nextInt(100);
        System.out.println(randomNum);

        int[] wrongPrediction = new int[5];
        int right = 0;
        boolean isWin = false;
        boolean isIncorrect = false;

        while(right<5) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            int predict = sc.nextInt();

            if (predict < 0 || predict > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz ! ");
                if (isIncorrect) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız : " + (5 - right));
                } else {
                    isIncorrect = true;
                    System.out.println("Bir daha hatalı giriş yaptığınızda tahmin hakkınızdan düşülecektir. ");
                }
                continue;
            }
            if (predict == randomNum) {
                System.out.println("Tebrikler doğru tahmin ettiniz! :) Tahmin ettiğiniz sayı :  " + predict);
                isWin = true;
                break;

            } else {
                System.out.print("Hatalı tahmin yaptınız! ");

                if (predict > randomNum) {
                    if ((predict - randomNum) < 10) {
                        System.out.println("Ama çok yaklaştınız. " + predict + " ile gizli sayı arasında 10'dan az fark var. :) " + predict + " sayısı, gizli sayıdan büyüktür. ");
                    } else {
                        System.out.println(predict + " sayısı, gizli sayıdan büyüktür. ");
                    }

                } else {
                    if ((randomNum - predict) < 10) {
                        System.out.println("Ama çok yaklaştınız. " + predict + " ile gizli sayı arasında 10'dan az fark var. :)  " + predict + " sayısı, gizli sayıdan küçüktür. ");
                    } else {
                        System.out.println(predict + " sayısı, gizli sayıdan küçüktür. ");
                    }
                }

                wrongPrediction[right++] = predict;
                System.out.println("Kalan tahmin hakkınız : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isIncorrect) {
                System.out.println("Tahminleriniz : ");
                for (int j : wrongPrediction) {
                    System.out.print(j + " ");
                }
            }
        }

    }
}