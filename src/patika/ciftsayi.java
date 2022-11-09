package patika;

import java.util.Scanner;

public class ciftsayi {
    public static void main(String []argh){
        int k=0, a=0, t=0;
        double ort;
        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        k = input.nextInt();

        for (int i= 0; i <=k; i++ ){
            if (i%3 == 0 && i%4 == 0){
                t += i;
                a++;
            }
        }
        ort = t / (a-1);
        System.out.println("sonuc : " +ort);
        input.close();

    }

    }
