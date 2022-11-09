package patika;

import java.util.Scanner;

public class harmonikseri {
    public static void main(String []argh){

        Scanner input = new Scanner(System.in);
        System.out.print("n sayisini giriniz : ");
        int n = input.nextInt();
        double result = 0.0;
        for (int i = 1; i <= n; i++){
            result += (1.0/i);
        }
        System.out.println(result) ;
    }

    }
