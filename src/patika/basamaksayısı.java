package patika;

import java.util.Scanner;

public class basamaksayısı {
    public static void main(String []argh){
        int number, basvalue, result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("sayi giriniz : ");
        number = input.nextInt();

        while (number != 0){
            basvalue = number%10;
            System.out.println(basvalue);
            result += basvalue;
            number /= 10;
        }
        System.out.println("toplam : " + result);

    }

    }
