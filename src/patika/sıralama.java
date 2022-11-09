package patika;

import java.util.Scanner;

public class sıralama {
    public static void main(String []argh){
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("ilk değeri giriniz : ");
        a = input.nextInt();
        System.out.print("ikinci değeri giriniz : ");
        b = input.nextInt();
        System.out.print("üçüncü değeri giriniz : ");
        c = input.nextInt();

        if((a>b) && (a>c)) {
            if (b > c) {
                System.out.println("a>b>c");
            } else {
                System.out.println("a>c>b");
            }
        }else if ((b>a) && (b>c)){
            if (a>c){
                System.out.println("b > a > c");
            }else {
                System.out.println("b>c>a");
            }
        }else{
            if (a>b){
                System.out.println("c>a>b");
            }else{
                System.out.println("c>b>a");
            }

        }
        }
    }
