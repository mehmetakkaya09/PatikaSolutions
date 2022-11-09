package patika;

import java.util.Scanner;

public class gelişmişhesapm {

    static int sum(int a, int b){
        int result = a - b;
        System.out.println("cikarma : " + result);
        return result;
    }
    static int minus(int a, int b){
        int result = a - b;
        System.out.println("toplam : " + result);
        return result;
    }
    static int times(int a, int b){
        int result = a * b;
        System.out.println("carpma : " + result);
        return result;
    }
    static int divide(int a, int b){
        if (b == 0){
            System.out.println("ikinci sayi sifirdan farkli olmalidir!");
            return 0;
        }
        int result = a / b;
        System.out.println("bölüm : " + result);
        return result;
    }
    static int power(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b){
        return a % b;
    }

    static void calc(int a, int b){
        System.out.println("cevresi : " + (2 * (a + b)));
        System.out.println("alani : " + (a * b));
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int select;


        String menu = "1 - toplama islemi\n"
                + "2 - cikarma islemi\n"
                + "3 - carpma islemi\n"
                + "4 - bolme islemi\n"
                + "5 - uslu sayi hesaplama \n"
                + "6 - mod alma\n"
                + "7 - dikdortgen alan ve cevre hesabi\n"
                + "0 - cikis yap\n";

        System.out.println(menu);
        while (true){
            System.out.print("bir işlem seçiniz : ");
            select = input.nextInt();
            if (select == 0){
                break;
            }
            System.out.print("ilk sayiyi giriniz : ");
            int a = input.nextInt();
            System.out.print("ikinci sayiyi giriniz : ");
            int b = input.nextInt();
            int result = 0;
            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divide(a,b);
                    break;
                case 5:
                    System.out.println("us hesabi : " + power(a,b));
                    break;
                case 6:
                    System.out.println("mod islemi : " + mod(a,b));
                    break;
                case 7:
                    calc(a,b);
                    break;
                default:
                    System.out.println("gecersiz islem yaptiniz!");

            }

        }
        System.out.println("gule gule!");

    }

    }
