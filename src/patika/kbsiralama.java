package patika;

import java.util.Arrays;
import java.util.Scanner;

public class kbsiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("dizinin boyutunu giriniz : ");
        int boyut = input.nextInt();
        int[] list = new int[boyut];

        System.out.println("dizideki elemanlari giriniz : ");
        for (int i = 0; i < list.length;i++){
            System.out.print((i+1) + ". Eleman : ");
            list[i] = input.nextInt();
        }
        System.out.println("Girilen Dizi : " + Arrays.toString(list));
        Arrays.sort(list);
        System.out.print("Siralanan dizi : " + Arrays.toString(list));
        input.close();
    }
}
