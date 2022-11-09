package patika;

import javax.print.attribute.standard.PresentationDirection;

public class Main {
    static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++){
            result *= base;
        }
            return result;
    }

    public static void main(String[] args) {
        /*int i = 1, k;
        System.out.println("program basladi");
        while (i <= 5) {
            System.out.println(i);
            i++;

            k = 1;
            while (k <= 10) {
                System.out.print(k + ",");
                k++;
            }
            System.out.println();
        }
        System.out.println("program bitti");
         */

        System.out.println(power(2,3));
        System.out.println(power(4,2));

    }

}