package patika;

public class çbdiziler {
    public static void main(String[] args) {
        int[][] matris = new int[3][4];
        int number = 1;
        for (int i = 0; i < matris.length; i++){
            for (int j = 0; j < matris[i].length; j++){
                matris[i][j] = number++;
                System.out.print(matris[i][j] + " ");

            }
            System.out.println();

        }
        for (int i = 0; i < matris.length; i++){
            for (int j = 0; j < matris[i].length; j++){
            }
        }









        /*
        int[] list = new int[5];

        int[][] matris = new int[6][6];
        matris[0][0] = 0;
        matris[2][3] = 839;
        System.out.println(matris[2][3]);

        int[][] matris1 = {
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };
        System.out.println(matris1[5][4]);

         */
    }
}
