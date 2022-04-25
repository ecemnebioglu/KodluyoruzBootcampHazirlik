import java.util.Scanner;

public class Main {
    static int f(int n) {
        if (n <= 0) {
            return n;
        }
        System.out.print(n + " ");
        return f(n - 5);
    }

    public static int addNumbers(int start, int end) {
        System.out.print(start + " ");
        if (start < end) {
            return start + addNumbers(start + 5, end);
        }
        return end;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, end;
        System.out.print("Sınır sayısını giriniz : ");
        n = sc.nextInt();
        end = n;
        System.out.print("Çıktısı : ");
        addNumbers(f(n), end);
    }
}
