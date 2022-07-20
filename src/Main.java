import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenlerimizi oluşturalım
        int a, b;
        double c;

        //kullanıcıdan verilerimizi alalım

        Scanner girdi = new Scanner(System.in);
        System.out.print("1. kenarı giriniz : ");
        a = girdi.nextInt();
        System.out.print("2. kenarı giriniz : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("hipotenüs : " + c);
    }
}