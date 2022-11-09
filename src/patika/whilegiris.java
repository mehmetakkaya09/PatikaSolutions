package patika;

import java.util.Scanner;

public class whilegiris {
    public static void main(String []argh){
        int password;
        boolean ispass = false;
        Scanner input = new Scanner(System.in);


        while (!ispass){
            System.out.print("şifre giriniz : ");
            password = input.nextInt();

            if (password==123){
                System.out.println("doğru");
                ispass = true;
            }else {
                System.out.println("yanlış");
            }
        }

    }

}
