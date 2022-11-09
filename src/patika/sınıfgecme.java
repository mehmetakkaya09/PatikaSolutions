package patika;

import java.util.Scanner;
public class sınıfgecme {
    public static void main(String []argh){

        int mat, fizik, türkçe, kimya, müzik;
        Scanner input = new Scanner(System.in);

        System.out.print("matematik notunuzu giriniz : ");
        mat = input.nextInt();

        System.out.print("fizik notunuzu giriniz : ");
        fizik = input.nextInt();

        System.out.print("türkçe notunuzu giriniz : ");
        türkçe = input.nextInt();

        System.out.print("kimya notunuzu giriniz : ");
        kimya = input.nextInt();

        System.out.print("müzik notunuzu giriniz : ");
        müzik = input.nextInt();

        double average = (mat + fizik + türkçe + kimya + müzik) / 5;

        if(average <= 55){
            System.out.println("sınıfta kaldı");
        }else{
            System.out.println("sınıfı geçti");
        }

        System.out.println("ortalamanız : " + average);



    }

}
