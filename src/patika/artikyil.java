package patika;

import java.util.Scanner;

public class artikyil {
    public static void main(String []argh){
        int yıl;
        boolean iserror = false;

        Scanner input = new Scanner(System.in);
        System.out.print( "yıl giriniz : ");
        yıl = input.nextInt();

        if (yıl % 4 == 0){
            if (yıl % 100 == 0){
                if (yıl % 400 == 0){
                    iserror = true;
                }else {
                    iserror = false;
                }
            }else {
                iserror = true;
            }
        }else {
            iserror = false;
        }
        if (iserror){
            System.out.println( "yili artik bir yildir!");
        }else {
            System.out.println(" yili artik bir yil değildir!");
        }
    }

    }
