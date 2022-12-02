package arrayofarrays;

import java.util.Scanner;

public class Triangular {


    public void triangularMatrix(int size) {

        int[][] h_array = new int[size][];
        for (int i = 0; i < h_array.length; i++) {
            h_array[i] = new int[i+1];
            for (int j = 0; j < i; j++) {
                h_array[i][j] = i;
                System.out.print(h_array[i][j] + " ");
             }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Triangular triangular = new Triangular();
        //Scanner scanner = new Scanner(System.in);
        //String size = scanner.nextLine();
        triangular.triangularMatrix(5);
    }
}
