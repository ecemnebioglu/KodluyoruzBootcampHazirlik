public class primeNumber {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i == 2 || i == 3 || i == 5 || i == 7) {
                System.out.print(i + " ");
            }
            if (i == 1) continue;
            if (i % 2 == 0) continue;
            if (i % 3 == 0) continue;
            if (i % 5 == 0) continue;
            if (i % 7 == 0) continue;

            System.out.print(i + " ");

        }

    }
}
