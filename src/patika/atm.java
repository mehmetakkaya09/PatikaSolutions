package patika;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {

        String username, password;
        Scanner input= new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0){
            System.out.print("kullanici adi giriniz : ");
            username = input.nextLine();
            System.out.print("sifre giriniz : ");
            password = input.nextLine();
            if (username.equals("patika") && password.equals("dev123")){
                System.out.println("merhaba, x bankasına hoşgeldiniz!");
                do {
                    System.out.println("1 - para yatırma\n" + "2 - para çekme\n" + "3 - bakiye sorgula\n" + "4 - çıkış yap");
                    System.out.print("lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("para miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("miktar giriniz : ");
                            int tmoney = input.nextInt();
                            if (tmoney > balance) {
                                System.out.println("bakiye yetersiz");
                            } else {
                                balance -= tmoney;
                            }
                            break;

                        case 3:
                            System.out.println("bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("tekrar görüşmek üzere!");
                            break;
                    }
                }while (select != 4);
            }else {
                right--;
                System.out.println("sisteme giriş yapamadınız!");
                if (right == 0){
                    System.out.println("hesabınız bloke olmuştur!");
                }else {
                    System.out.println("kalan hakkiniz : "+ right);
                }

            }
        }


    }

    }
