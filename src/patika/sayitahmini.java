package patika;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sayitahmini {
    public static void main(String[] args) {
        //int number = (int)(Math.random() * 100);
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        while (right < 5){
            System.out.print("Lutfen Tahmininizi Giriniz : ");
            selected = input.nextInt();
            if (selected < 0 || selected > 99){
                System.out.println("Lutfen 0 Ile 100 Arasında Bir Deger Giriniz!");
                if (isWrong){
                    right++;
                    System.out.println("Cok Fazla Hatali Giris Yaptiniz! Kalan Hakkiniz :" + (5-right));
                }else {
                    isWrong = true;
                    System.out.println("Bir Daha Hatali Girisinizde Can Hakkinizden Düsülecektir!");
                }
                continue;
            }
            if (selected == number){
                System.out.println("Tebrikler! Dogru Tahmin! Tahmin Ettiginiz Sayi : " + number);
                isWin = true;
                break;
            }else {

                System.out.println("Hatali Bir Sayi Girdiniz!");
                if (selected > number){
                    System.out.println(selected + " Sayisi Gizli Sayidan Buyuktur!");
                }else {
                    System.out.println(selected + " Sayisi Gizli Sayidan Kucuktur!");
                }
                wrong[right++] = selected;
                System.out.println("Kalan Hakki : " + (5 - right));
            }

        }
        if (!isWin){
            System.out.println("Kaybettiniz!");
            if (!isWrong){
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));

            }

        }
        System.out.println("Dogru Sayi :" + number);

    }
}
