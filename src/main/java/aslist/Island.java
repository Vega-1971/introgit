package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Island {

    public static void main(String[] args) {

        List<String> importantThings = Arrays.asList("gyufa", "ivóvíz", "kés");
        System.out.println(importantThings);

        List<String> extendedImportantThings = new ArrayList<>(importantThings);

        extendedImportantThings.set(1, "napolaj");

        System.out.println(extendedImportantThings);
    }
}
