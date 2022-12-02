package intromethods.registration;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate dateOfBirth;
    private String email;

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public Person(String name, LocalDate dateOfBirth, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    @Override
    public String toString() {
        return "A jelentkező adatai:\n" +
                "Neve: " + name + "\n" +
                "Születési éve: " + dateOfBirth + "\n" +
                "E-mail címe: " + email;
    }
}
