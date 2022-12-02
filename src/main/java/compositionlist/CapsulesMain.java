package compositionlist;

import java.util.ArrayList;
import java.util.Arrays;

public class CapsulesMain {

    public static void main(String[] args) {

        Capsules capsules = new Capsules();

        capsules.addLast("fehér");
        capsules.addLast("kék");
        capsules.addLast("piros");
        capsules.addLast("barna");

        capsules.removeLast();


        System.out.println(capsules.getColors());

                //ArrayList<>(Arrays.asList("Sárga", "Zöld", "Kék", "Piros", "Fehér"));

    }

}
