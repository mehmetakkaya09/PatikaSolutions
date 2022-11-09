package patika;

import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        int counter, number, min = 1, max = 1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kac Tane Sayi Gireceksiniz : ");
        counter = inp.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print("Lutfen " + i + ". Sayiyi Giriniz : ");
            number = inp.nextInt();
            if (i == 1) {
                max = number;
                min = number;
            }
            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }

        }
        System.out.println("En Buyuk Sayi : " + max);
        System.out.println("En Kucuk Sayi : " + min);


    }

}
