import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] frecuency = new int[arr.length];
        int count = 1;
        int visit = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = (i + 1); j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frecuency[j] = visit;
                }
            }
            if (frecuency[i] != visit) {
                frecuency[i] = count;
            }
        }
        System.out.println("Dizi : "+Arrays.toString(arr));
        System.out.println("Tekrar Sayıları");
        for (int i =0; i<frecuency.length;i++){
            if (frecuency[i]!=visit){
                System.out.println(arr[i]+" sayısı "+frecuency[i]+" kere tekrar edildi. ");
            }
        }
    }
}
