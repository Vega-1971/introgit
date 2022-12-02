package array;

public class ArrayMain {

    public static void main(String[] args) {


        String[] dayNames = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
        System.out.println(dayNames[1]);
        System.out.println(dayNames.length);


        int[] sqrOfTwo = new int[5];

        for (int i = 0; i < sqrOfTwo.length; i++) {
            if (i == 0) {
                sqrOfTwo[i] = 1;
            } else {
                sqrOfTwo[i] = sqrOfTwo[i - 1] * 2;
            }
            System.out.print(sqrOfTwo[i] + " ");
        }
        System.out.println();
        boolean[] varyFalseTrue = new boolean[6];
        varyFalseTrue[0] = false;
        for (int i = 1; i < varyFalseTrue.length; i++) {
            varyFalseTrue[i] = !varyFalseTrue[i - 1];
        }
        for (boolean itemValue : varyFalseTrue) {
            System.out.print(itemValue + " ");
        }
        System.out.println();

        //Innen már egy másik feladatrész jön

        ArrayHandler arrayHandler = new ArrayHandler();

        int[] myLotteryNumbers = {5, 8, 37, 39, 71};
        String[] myFavouriteColours = {"lightcyan", "darkblue", "white", "green"};

        arrayHandler.addIndexToNumber(myLotteryNumbers);

        for (int i : myLotteryNumbers) {
            System.out.println(i);
        }

        for (int i : myLotteryNumbers) {
            System.out.print(i + ", ");
        }

        System.out.println();

        arrayHandler.concatenateIndexTwoWord(myFavouriteColours);

        for (String s : myFavouriteColours) {
            System.out.println(s);
        }

        for (String s : myFavouriteColours) {
            System.out.print(s + ", ");
        }
    }
}
