package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {

        List<String> ingredients = new ArrayList<>();

        ingredients.add("tej");
        ingredients.add("vaj");
        ingredients.add("sajt");
        ingredients.add("párizsi");
        ingredients.add("tejföl");

        System.out.println(ingredients.size());
        System.out.println(ingredients);

        ingredients.remove(0);
        ingredients.remove(3);

        System.out.println(ingredients.size());
        System.out.println(ingredients);
    }
}
