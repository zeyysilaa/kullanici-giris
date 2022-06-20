import java.util.Scanner;
public class Giris {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        String kullaniciadi = "zeyysilaa", sifre = "churchill";
        String bkullaniciadi, bsifre;

        System.out.println("Kullanici adi giriniz : ");
        bkullaniciadi = girdi.nextLine();
        System.out.println("Sifre giriniz : ");
        bsifre = girdi.nextLine();

        if (bkullaniciadi.equals(kullaniciadi) && bsifre.equals(sifre)) {
            System.out.println("Giriş yapıldı.");
        } else {
            System.out.println("Şifrenizi değiştirmek isterseniz 1 e basin");
            int sifredegisimi = girdi.nextInt();
            switch (sifredegisimi) {
                case 1:
                    System.out.println("Yeni bir şifre giriniz.");
                    bsifre = girdi.nextLine();
                    break;
                default:
                    System.out.println("baybay");
            }
            }
        bsifre = girdi.nextLine();
        if (bsifre.equals(sifre)) {
            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
        } else {
            System.out.println("Şifre oluşturuldu.");

        }
    }
}
