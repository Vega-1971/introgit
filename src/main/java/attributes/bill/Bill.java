package attributes.bill;

public class Bill {

    private String product;
    private int price;
    private int quantity;
    private double vatPercent;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getVatPercent() {
        return vatPercent;
    }

    public void setVatPercent(double vatPercent) {
        this.vatPercent = vatPercent;
    }

    public Bill(String product, int price, int quantity, double vatPercent) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.vatPercent = vatPercent;

    }

    public double calculateTotalPrice(){
        return price*quantity*vatPercent/100;

    }
}
