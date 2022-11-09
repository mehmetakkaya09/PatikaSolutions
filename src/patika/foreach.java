package patika;

public class foreach {
    public static void main(String[] args) {
        /*
        String [] cars = {"BMW", "MERCEDES", "AUDI"};
        for (String str : cars){
            System.out.println(str);
        }
         */
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int i = 0;i < matris.length; i++){
            for (int j = 0; j < matris[i].length; j ++){
            }
        }
        for (int[] row : matris){
            for (int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
