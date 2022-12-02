package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {

    public LocalDate getDateOfBirth(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }
    public String createFullName(String fName, String lName) {
        return lName + " " + fName;
    }

    public static void main(String[] args) {

        Registration registration = new Registration();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vezetéknév: ");
        String lastName = scanner.nextLine();
        System.out.println("Keresztnév: ");
        String firstName = scanner.nextLine();
        System.out.println("Szül. év: ");
        int b_year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Szül. hónap: ");
        int b_month = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Szül. nap: ");
        int b_day = scanner.nextInt();
        scanner.nextLine();
        System.out.println("e-mail cím: ");
        String mail = scanner.nextLine();

        LocalDate dBirth = registration.getDateOfBirth(b_year, b_month, b_day);
        String wholeName = registration.createFullName(firstName, lastName);

        Person newPerson = new Person(wholeName, dBirth, mail);
        System.out.println(newPerson);

    }
}
