package arraylist;

import java.util.Arrays;
import java.util.List;

public class Crossword {

    public static void main(String[] args) {

        String[] objects = {"KULCS", "KÁLYHA", "LÓ", "AJTÓ", "CSERESZNYEFA", "TEJ", "FELHŐ", "CIPŐ", "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA"};
        List<String> words = Arrays.asList(objects);

        for (String item : objects) {
            int wordLength = item.length();
            if (wordLength == 6) {
                System.out.println(item);
            }
        }
    }
}
