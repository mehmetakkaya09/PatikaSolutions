import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kilo, boy, vke;


        Scanner input = new Scanner(System.in);
        System.out.print("lütfen boyunuzu (metre cinsinde) giriniz : ");

        boy = input.nextDouble();

        System.out.print("lütfen kilonuzu giriniz : ");

        kilo = input.nextDouble();

        vke = (kilo) / (boy * boy);

        String sonuc = (vke < 30) ? "zayıfsınız" : "kilolusunuz";

        System.out.println("vücut kitle endeksiniz : " + vke);
        System.out.println("endeks sonucunuz : " + sonuc);

    }
}