package patika;

import java.util.Scanner;

public class recursasal {
    static  boolean asalsayi(int sayi, int i){
        if (sayi <= 2){
            return (sayi == 2) ? true : false;
        }

        if (sayi % i == 0){
            return false;
        }

        if (i * i > sayi){
            return true;
        }
        return asalsayi(sayi, i + 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayıyı giriniz: ");
        int sayi = sc.nextInt();

        if (asalsayi(sayi, 2)) {
            System.out.println(sayi + " sayısı asal sayıdır. ");
        } else {
            System.out.println(sayi + " sayısı asal sayı değildir.");
        }


    }
}