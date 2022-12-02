package composition.person;

public class Person {

    private String name;
    private String identificationCard;

    private Address address;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", identificationCard='" + identificationCard + '\'' +
                '}';
    }

    public void moveTo(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void correctData(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }
}
