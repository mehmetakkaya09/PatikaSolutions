package patika;

public class continuebreak {
    public static void main(String []argh){
        /*
        for (int i = 1; i <=10; i++){

            if (i == 5){
                System.out.println("i değeri 5tir");
                break;
            }

            if (i == 5){
                continue;
            }
            System.out.println(i);
        }
         */
        int i = 1;
        while (i <= 10){
            i++;
            if (i%2 == 0){
                continue;

            }
            System.out.println(i);
        }
    }

    }
