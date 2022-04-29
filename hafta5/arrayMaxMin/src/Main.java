public class Main {
    public static void main(String[] args) {
        int[] arr = {95, 55, 3, 48, 7, 61, 2, 1};
        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Maksimum Değer = " + max);
        System.out.println("Minimum Değer = " + min);
    }
}
