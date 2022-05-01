public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 8, 4, 41, 12, 12, 52, 8, 2, 4, 6, 16};
        int[] duplicate = new int[arr.length];
        int startIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = (i + 1); j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (arr[i] % 2 == 0) {
                        if (!isFind(duplicate, arr[i])) {
                            duplicate[startIndex++] = arr[i];
                        }
                        break;
                    }
                }
            }
        }

        for (int value : duplicate) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
    }
}
