package patika;

import java.util.Scanner;

public class dörtbeş {
    public static void main(String[] argh) {

        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("sayi giriniz : ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }
        for (int i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }
    }
}
