package patika;

import java.util.Arrays;
import java.util.Scanner;

public class minmaxval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sayi giriniz : ");
        int sayi = input.nextInt();

        int[] list = {15,12,788,1,-1,-778,2,0};

        int minsayi = list[0];
        int maxsayi = list[0];
        Arrays.sort(list);
        for (int i : list){
            if (sayi > i){
                minsayi = i;
            }
            if (sayi < i){
                maxsayi = i;
                break;
            }
        }
        System.out.println("minimum : " + minsayi);
        System.out.println("maximum : " + maxsayi);
    }
}
