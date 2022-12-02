package training;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        String message = "Hello World!";
        System.out.println(message);

        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Year of birth?");
        int yearOfBirth = scanner.nextInt();
        System.out.println("Year of birth: " + yearOfBirth);
        System.out.println("Age: "+ (2022-yearOfBirth));
    }
}
