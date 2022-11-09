package patika;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] argh) {
/*
        int a =2451, basamaksayisi = 0, numbercounter= 0;

        //basamak sayısı bulma işlemi aşağıdaki gibidir.
        // numbercounter++ yapınca nasıl bir bir artıyor hangi mantığa göre ?
        //toplam+=a gibi değerler hangi mantığa göre işliyor?

        System.out.println(a);
        while (a != 0){
            a /= 10;
            System.out.println(a);
            numbercounter++;
        }
        System.out.println(numbercounter);

        //bir sayının son basamağını bulma işlemi
        //2451 % 10 : 1 ---- burada mod işlemi uygulanır ve son kalan sayı basamak değerini verir.

        int b = 2452;
        int c = b%10;
        System.out.println(c);
 */
        Scanner input = new Scanner(System.in);
        System.out.print("sayi giriniz :");
        int number = input.nextInt();
        int basnumber = 0;
        int tempnumber = number;
        int basvalue;
        int result = 0;
        int baspow;
        while (tempnumber != 0) {
            tempnumber /= 10;
            basnumber++;
        }

        tempnumber = number;
        while (tempnumber != 0){
            basvalue = tempnumber%10;
            baspow = 1;
            for (int i = 1;i <= basnumber; i++){
                baspow *= basvalue;
            }
            result += baspow;
            tempnumber /= 10;
        }
        if (result == number){
            System.out.println(number + "bir armstrong sayıdır!");
        }else {
            System.out.println(number + "bir armstrong sayı değildir!");
        }

    }


}
