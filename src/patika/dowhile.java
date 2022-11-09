package patika;

import java.util.Scanner;

public class dowhile {
    public static void main(String []argh){
        Scanner input = new Scanner(System.in);

        int firstNumber, secondNumber, smallNumber , bigNumber ;
        int GCD, LCM ;

        System.out.print("Enter the first number : ");
        firstNumber = input.nextInt();

        System.out.print("Enter the second number : ");
        secondNumber = input.nextInt();

        if (firstNumber < secondNumber){
            smallNumber = firstNumber ;
            bigNumber = secondNumber ;

        } else {
            smallNumber = secondNumber ;
            bigNumber = firstNumber ;
        }

        int i = smallNumber ;
        while (i >= 1){
            if (firstNumber % i == 0 && secondNumber % i == 0){
                GCD = i ;
                System.out.println("The greatest common divider is : " + GCD);
                break;
            }
            i-- ;
        }

        int k = 1;
        while (k <= firstNumber * secondNumber){
            if (k % firstNumber == 0 && k % secondNumber == 0){
                LCM = k ;
                System.out.print("The least common multiple is : " + LCM);
                break;
            }
            k++ ;
        }

    }
}