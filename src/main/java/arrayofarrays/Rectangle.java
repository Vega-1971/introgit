package arrayofarrays;

public class Rectangle {

    public void rectangleMatrix(int size) {

        int[][] r_array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                r_array[i][j] = i;
                System.out.print(r_array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        //Scanner scanner = new Scanner(System.in);
        //String size = scanner.nextLine();
        rectangle.rectangleMatrix(5);
    }
}
