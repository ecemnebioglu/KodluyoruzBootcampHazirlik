import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp=0;

        System.out.print("Dizinin Boyutunu Giriniz : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". elemanı : ");
            arr[i] = sc.nextInt();
        }
       for(int i = 0; i<n-1;i++) {
           for(int j=(i+1);j<n;j++){
               if (arr[j]<arr[i]) {
                   temp = arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
       }
        System.out.print("Sıralama : " + Arrays.toString(arr));
    }
}
