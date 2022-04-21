import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int select;
        int balance=1500;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = sc.nextLine();
            System.out.print("Şifrenizi Giriniz : ");
            password = sc.nextLine();


            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz ! ");
                do {
                    System.out.println("1- Para Yatırma\n2- Para Çekme\n3- Bakiye Sorgulama\n4- Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = sc.nextInt();

                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz para miktarını giriniz : ");
                            int price = sc.nextInt();
                            balance+=price;
                            System.out.println("Yeni bakiyeniz : " + balance);
                        case 2:
                            System.out.print("Çekmek istediğiniz para miktarını giriniz : ");
                            price = sc.nextInt();
                            if(price>balance){
                                System.out.println("Bakiyeniz yetersiz. ");
                            }else {
                                balance-=price;
                                System.out.println("Para çekme işleminiz başarılı\nYeni bakiyeniz : " + balance);
                            }
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                    }
                } while (select != 4);
                System.out.println("Başarıyla çıkış yaptınız. Tekrar görüşmek üzere. :)");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz ! ");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}

