import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("ücret tutarını giriniz : ");
        tutar = input.nextDouble();
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        System.out.println("kdvsiztutar : " + tutar);
        System.out.println("kdvoranı : " + kdvOran);
        System.out.println("kdvtutarı : " + kdvTutar);
        System.out.println("kdvtoplamı : " + kdvliTutar);


    }
}