package patika;

import java.util.Arrays;

public class frekans{
    public static void main(String[] args) {
        int[] numbers = {10,20,20,10,10,20,5,20};
        Arrays.sort(numbers);
        int n = 1, a = 0;

        for (int i = 0;i < numbers.length; i++){
            if (numbers[i]!= a){
                for (int j = i + 1; j < numbers.length; j++){
                    if (numbers[i] == numbers[j]) {
                        n++;
                        a = numbers[i];
                    }
                }

                System.out.printf("% d sayısı % d kere tekrar edildi.", numbers[i], n);
                n = 1;
            }
        }

    }
}
