import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6};
        double sum = 0.0;

        for (int i=0; i < list.length; i++) {
            sum += list[i];
        }
        System.out.println("Dizinin elemanları toplamı : " + sum);
        double average = sum / list.length;
        System.out.println("Dizinin ortalaması : " + average);
    }
}
