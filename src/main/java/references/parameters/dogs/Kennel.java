package references.parameters.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        Dog morzsi = new Dog("Morzsi", 5, "barna");
        Dog luna = new Dog("Luna", 6, "fehér");
        Dog blacky = new Dog("Blacky", 10, "fekete");

        dogs.add(morzsi);
        dogs.add(luna);
        dogs.add(blacky);

        System.out.println(dogs);

        Dog muki = morzsi;

        muki.setColour("lightgray");
        System.out.println(dogs);

        Dog killer = new Dog("Killer", 12, "black&tan");
        System.out.println(killer);

        killer = morzsi;
        System.out.println(killer);

        dogs.add(killer);
        System.out.println(dogs);

        killer.setColour("lightyellow");
        System.out.println(dogs);

        List<Dog> dogs2 = dogs;

        Dog timid = killer;
        timid.setColour("orange");

        System.out.println(dogs2);

        luna.setColour("lightbrown");
        System.out.println(dogs2);

        Dog puppy = morzsi;
        puppy = null;
        System.out.println(dogs2);

        Dog fifi = morzsi;
        fifi.setColour("snowwhite");
        System.out.println(dogs2);






    }
}
