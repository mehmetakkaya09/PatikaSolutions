package patika;

import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.00, Tutar, elmaMiktarı, armutMiktarı, domatesMiktarı, muzMiktarı, patlıcanMiktarı;

        Scanner input = new Scanner(System.in);

        System.out.print("armut kaç kilo ? : ");
        armutMiktarı = input.nextDouble();
        System.out.print("elma kaç kilo ? : ");
        elmaMiktarı = input.nextDouble();
        System.out.print("domates kaç kilo ? : ");
        domatesMiktarı = input.nextDouble();
        System.out.print("muz kaç kilo ? : ");
        muzMiktarı = input.nextDouble();
        System.out.print("patlıcan kaç kilo ? : ");
        patlıcanMiktarı = input.nextDouble();

        Tutar = (armut * armutMiktarı) + (elma * elmaMiktarı) + (domates * domatesMiktarı) + (muz * muzMiktarı) + (patlıcan * patlıcanMiktarı);

        System.out.println("toplam tutar : " + Tutar);





    }

    }