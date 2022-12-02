package composition.person;

public class PersonMain {

    public static void main(String[] args) {

        Person firstPerson = new Person();
        System.out.println(firstPerson.getAddress());
        firstPerson.setName("Vetró Gábor");
        firstPerson.setIdentificationCard("VG007");
        firstPerson.setAddress(new Address("Magyarország", "Vecsés", "Szondi utca, 68", "2220"));
        System.out.println(firstPerson.getAddress()+firstPerson.toString());

        firstPerson.moveTo(new Address("Magyarország", "Gyál", "Lapos dűlő 1.", "2221"));
        firstPerson.correctData("Vetró Gabcsesz", "VG777");
        System.out.println(firstPerson.getAddress()+firstPerson.toString());
    }
}
