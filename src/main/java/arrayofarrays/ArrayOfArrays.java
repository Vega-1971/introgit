package arrayofarrays;

public class ArrayOfArrays {

    public void printArrayOfArrays(int[][] array_name) {

        for (int i = 0; i < array_name.length; i++) {
            for (int array_item : array_name[i]) {
                System.out.print(array_item + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();

        int[][] c_array = {{0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}};

        arrayOfArrays.printArrayOfArrays(c_array);
        }

}
