package patika;

import java.util.Scanner;

public class kullanıcıGirisi {
    public static void main(String []argh){

        String username, password;
        Scanner inp = new Scanner(System.in);

        System.out.print("kullanıcı adınız : ");
        username = inp.nextLine();

        System.out.print("sifreniz : ");
        password = inp.nextLine();

        if(username.equals("patika") && password.equals("java123")){
            System.out.println("giris yaptınız!");

        }else{
            System.out.println("giris yapamadınız!");
        }


    }

}

