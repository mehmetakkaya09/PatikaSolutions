package patika;

import java.util.Scanner;

public class üslüsayı {
    public static void main(String []argh){

        int n,k, total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("üssü alınacak sayı : ");
        n = input.nextInt();
        System.out.print("üs olacak sayı: ");
        k = input.nextInt();
/*
        int i =1, total = 1;
        while (i <= k){
            total *=n;
            i++;
        }
 */
        // bunun mantığını sor? total nasıl üst kısmı tanıyor ve böyle bir mantıkta çalışıyor?
        for (int i = 1; i <= k; i++)
            total *= n;
        System.out.println("cevap : " + total);
    }

    }
