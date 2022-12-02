package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {

    public static void main(String[] args) {

        List<String> favouriteThings = new ArrayList<>();
        System.out.print("Kedvenc állatod? ");
        Scanner scanner= new Scanner(System.in);
        String animal = scanner.nextLine();
        System.out.print("Kedvenc színed? ");
        String colour = scanner.nextLine();
        System.out.print("Kedvenc évszakod? ");
        String season = scanner.nextLine();

        favouriteThings.add(animal);
        favouriteThings.add(colour);
        favouriteThings.add(season);

        System.out.println(favouriteThings.size());
        System.out.println(favouriteThings);

    }
}
