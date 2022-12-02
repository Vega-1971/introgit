package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsListMain {

    public static void main(String[] args) {

        List<String> sampleList_1 = Arrays.asList("John", "Jack", "Jim");
        System.out.println(sampleList_1);

        List<String> sampleList_2 = new ArrayList<>();
        sampleList_2.add("Gábor");
        sampleList_2.add("Béla");
        System.out.println(sampleList_2);

        List<String> sampleList_3 = new ArrayList<>(Arrays.asList("John", "Jack", "Jim"));

        sampleList_3.add("Carol");
        System.out.println(sampleList_3);
    }

}
