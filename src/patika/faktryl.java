package patika;

import java.util.Scanner;

public class faktryl {
    public static void main(String []argh){

        Scanner input = new Scanner(System.in);
        System.out.print("sayi giriniz : ");
        int n = input.nextInt();
        int total = 1;

        for (int i = 1; i <= n;i++){
            total = total * i;
        }
        System.out.println(n + "faktöriyel : " + total);
    }

    }
