package patika;

import java.util.Scanner;
public class hesapmakinesi {
    public static void main(String []argh){

        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.print("ikinci sayıyı giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-toplama\n2-cıkarma\n3-carpma\n4-bolme");
        System.out.print("seciminiz : ");
        select = input.nextInt();


        switch (select){
            case 1:
                System.out.println("toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("cıkarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("carpma : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0){
                    System.out.println(n1 / n2);
                }
                else {
                    System.out.println("0 bulunmez");
                }
                break;
            default:
                System.out.println("gecersiz islem");
        }


    }
}