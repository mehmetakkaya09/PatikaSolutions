package patika;

import java.util.Scanner;

public class recursus {

    static int sonuc(int taban, int us){
        int result = 1;
        for (int i = 1; i <= us; i++){
            result *= taban;
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("taban sayisini giriniz : ");
        int taban = input.nextInt();
        System.out.print("us sayisini giriniz : ");
        int us = input.nextInt();

        System.out.println("us sonucu : " + sonuc(taban,us));
    }

    }
