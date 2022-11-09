package patika;

import java.util.Scanner;

public class desen {
    static int negative(int x){
        if (x <=0){
            return x;

        }
        else{
            System.out.print(x + " ");
            int negative = negative(x - 5);
            return negative;
        }
    }

    static int positive (int x, int y){
        if (x>y){
            return x;
        }
        else {
            System.out.print(x+ " ");
            return positive(x+5,y);
        }

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        while (true){
            System.out.println("Enter Your Number");
            int number = inp.nextInt();

            positive(negative(number),number);

            if (number == 0 ){
                break;
            }
            System.out.println("Enter 0 to exit.\n");

        }
    }


}
