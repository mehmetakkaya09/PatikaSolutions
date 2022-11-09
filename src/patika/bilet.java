package patika;

import java.util.Scanner;

public class bilet {
    public static void main(String []argh){
        int km, yas, tip;
        double perKm = 0.10, onikialtı = 0.50, onikiyirmidört = 0.90, altmışbeşüstü = 0.70, tip2indirimi = 0.80, tutar;
        boolean ishata;
        Scanner input = new Scanner(System.in);

        System.out.print("mesafe giriniz : ");
        km = input.nextInt();
        System.out.print("yas giriniz : ");
        yas = input.nextInt();
        System.out.print("yolculuk tipi seciniz :\n1-) Tek Yön\n2-) Gidiş-Dönüş ");
        tip = input.nextInt();

        tutar = km * perKm;
        if (yas < 0){
            System.out.println("yanlis giris yaptiniz!");
        }else{
            if (tip == 2){
                km = km *2;
                System.out.println("km : " + km);
                tutar = (km * perKm) * tip2indirimi;
                if (yas < 12){
                    tutar = tutar * onikialtı;
                    ishata = true;
                } else if (yas <= 24) {
                    tutar = tutar * onikiyirmidört;
                    ishata = true;
                } else if (yas >= 65) {
                    tutar = tutar * altmışbeşüstü;
                    ishata = true;
                }else {
                    ishata = true;
                }
            } else if (tip == 1) {
                if ( yas < 12){
                    tutar = tutar * onikialtı;
                    ishata = true;
                } else if (yas <= 24) {
                    tutar = tutar * onikiyirmidört;
                    ishata = true;
                } else if (yas >= 65) {
                    tutar = tutar * altmışbeşüstü;
                    ishata = true;
                }else {
                    ishata = true;

                }

            }else {
                ishata = false;
            }
        }

        if (ishata = false){
            System.out.println("yanlis giris yapildi!");
        }else {
            System.out.println("ücret : " + tutar);
        }


    }

    }
