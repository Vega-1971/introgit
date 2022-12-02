package realestate;

public class Details {

    private String description;
    private Address address;
    private int squareMeter;
    private int araOfSite;

    public Details(String description, Address address, int squareMeter, int araOfSite) {
        this.description = description;
        this.address = address;
        this.squareMeter = squareMeter;
        this.araOfSite = araOfSite;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(int squareMeter) {
        this.squareMeter = squareMeter;
    }

    public int getAraOfSite() {
        return araOfSite;
    }

    public void setAraOfSite(int araOfSite) {
        this.araOfSite = araOfSite;
    }

    @Override
    public String toString() {
        return "Details{" +
                "description='" + description + '\'' +
                ", address=" + address +
                ", squareMeter=" + squareMeter +
                ", araOfSite=" + araOfSite +
                '}';
    }
}
