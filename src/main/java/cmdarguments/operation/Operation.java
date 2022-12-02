package cmdarguments.operation;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine();
        args[0] = firstWord;
        System.out.println(args[0]);

        for (String word : args) {
            if (word.equals("/list")) {
                System.out.println("Listázás");
            } else if (word.equals("/add")) {
                System.out.println("Hozzáadás");
            } else if (word.equals("/delete")) {
                System.out.println("Törlés");
            } else {
                System.out.println("Ismeretlen művelet");
            }


        }
    }
}
