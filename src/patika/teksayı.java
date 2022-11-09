package patika;

import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class teksayı {
    public static void main(String []argh){
        int n, toplam = 0;
        Scanner inp= new Scanner(System.in);
        do {
            System.out.print("sayi giriniz : ");
            n = inp.nextInt();
            if (n%2 == 0 && n%4 == 0){
                toplam += n;
            }
        }while (n %2 == 0);
        System.out.println("toplam : " + toplam);

    }

    }
