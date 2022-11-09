package patika;

import java.util.Scanner;

public class ebobekok {
    public static void main(String[] args) {
        int n1, n2;
        boolean a = false;

        do {
            Scanner inp = new Scanner(System.in);
            System.out.print("1. sayiyi giriniz : ");
            n1 = inp.nextInt();
            System.out.print("2. sayiyi giriniz : ");
            n2 = inp.nextInt();
            if (n1 <= 0 || n2 <= 0) {
                System.out.println("pozitif sayı giriniz!");
            } else {
                a = true;
            }
        }
        while (! a);
        if (n2 < n1) {
            int tempn2 = n2;
            n2 = n1;
            n1 = tempn2;
        }
        int i = n1;
        while (i>=1){
            if (n1 % i == 0 && n2 % i == 0){
                System.out.println("ebob : " + i);
                break;
            }else {
                i--;
            }
        }
        int k = n2;
        while (k <= (n1 * n2)){
            if (k % n1 == 0 && k % n2 == 0){
                System.out.println("ekok : " +k);
                break;
            }else {
                k++;
            }
        }

/*
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println(i);
                ebob = i;
            }
        }


        for (int k = n1; k >= 1; k--) {
            if (n1 % k == 0 && n2 % k == 0){
                ebob = k;
                break;
            }
        }
        for (int i = 1; i <= (n1 * n2); i++){
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println(i);
                break;

            }
        }
        System.out.println((n1*n2)/ebob);
 */

    }

}
