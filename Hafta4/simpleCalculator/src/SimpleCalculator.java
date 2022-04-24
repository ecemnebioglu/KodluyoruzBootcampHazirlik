import java.util.Scanner;

public class SimpleCalculator {
    static void addition() {
        Scanner sc = new Scanner(System.in);
        int num, result = 0, piece;
        System.out.print("Kaç adet sayı ile işlem yapacaksınız : ");
        piece = sc.nextInt();
        for (int i = 1; i <= piece; i++) {
            System.out.print(i + ". sayı : ");
            num = sc.nextInt();
            if (i == 1) {
                result = num;
                continue;
            }
            result += num;
        }
        System.out.println("Toplama İşleminin Sonucu : " + result);
    }

    static void subtraction() {
        Scanner sc = new Scanner(System.in);
        int num, result = 0, piece;
        System.out.print("Kaç adet sayı ile işlem yapacaksınız : ");
        piece = sc.nextInt();

        for (int i = 1; i <= piece; i++) {
            System.out.print(i + ". sayı : ");
            num = sc.nextInt();
            if (i == 1) {
                result = num;
                continue;
            }
            result -= num;
        }
        System.out.println("Çıkarma işleminin sonucu : " + result);
    }

    static void multiplication() {
        Scanner sc = new Scanner(System.in);
        int num, result = 1, piece;
        System.out.print("Kaç adet sayı ile işlem yapacaksınız : ");
        piece = sc.nextInt();

        for (int i = 1; i <= piece; i++) {
            System.out.print(i + ". Sayı : ");
            num = sc.nextInt();
            if (i == 1) {
                result = num;
                continue;
            }
            result *= num;
        }
        System.out.println("Çarpma işleminin sonucu : " + result);
    }

    static void division() {
        Scanner sc = new Scanner(System.in);
        int piece;
        double num, result = 1.0;
        System.out.print("Kaç adet sayıyla işlem yapmak istiyorsunuz : ");
        piece = sc.nextInt();

        for (int i = 1; i <= piece; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            num = sc.nextInt();
            if (i != 1 && num == 0) {
                System.out.println("Böleni 0 giremezsiniz .");
                continue;
            }
            if (i == 1) {
                result = num;
                continue;
            }
            result /= num;
        }
        System.out.println("Bölme işleminin sonucu " + result);
    }

    static void exponentialNumber() {
        Scanner sc = new Scanner(System.in);
        int pow, sub, result = 1;
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        sub = sc.nextInt();
        System.out.print("Üs değeri giriniz : ");
        pow = sc.nextInt();

        for (int i = 1; i <= pow; i++) {
            result *= sub;
        }
        System.out.println(sub + "'ın " + pow + ".kuvveti : " + result);

    }

    static void factorial() {
        Scanner sc = new Scanner(System.in);
        int result = 1, num;
        System.out.print("Faktöriyeli hesaplanacak sayıyı giriniz : ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println(num + "! : " + result);
    }

    static void mode() {
        Scanner sc = new Scanner(System.in);
        int num, mode, result;
        System.out.print("Modu alınacak sayıyı giriniz : ");
        num = sc.nextInt();
        System.out.print("Mod değerini giriniz : ");
        mode = sc.nextInt();

        result = num % mode;
        System.out.println("Sonuç : " + result);
    }

    static void rectangle() {
        Scanner sc = new Scanner(System.in);
        int length, width, perimeter, area;
        System.out.print("Kısa kenarı giriniz : ");
        width = sc.nextInt();
        System.out.print("Uzun kenarı giriniz : ");
        length = sc.nextInt();

        area = length * width;
        perimeter = 2 * (length + width);

        System.out.println("Dikdörtgenin alanı : " + area);
        System.out.println("Dikdörtgenin çevresi : " + perimeter);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;
        String menu = "1. Toplama\n"
                + "2. Çıkarma\n"
                + "3. Çarpma\n"
                + "4. Bölme\n"
                + "5. Üslü Sayı Hesaplama\n"
                + "6. Faktöriyel Hesaplama\n"
                + "7. Mod Alma\n"
                + "8. Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0. Çıkış";
        System.out.println(menu);

        do {
            System.out.print("Lütfen bir işlem seçiniz : ");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    exponentialNumber();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz. Lütfen tekrar deneyiniz. ");
            }
        } while (select != 0);
    }
}
