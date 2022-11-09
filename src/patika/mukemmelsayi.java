package patika;

import java.util.Scanner;

public class mukemmelsayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("lutfen sayi giriniz : ");
        int nr = input.nextInt();
        int sumnr = 0;

        for (int i = nr-1; i >= 1; i--){
            if (nr % i ==0){
                sumnr += i;
            }

        }
        if (sumnr == nr){
            System.out.println("sayiniz mukemmel bir sayidir!");
        }else {
            System.out.println("sayiniz mukemmel bir sayi değildir!");
        }
    }

    }
