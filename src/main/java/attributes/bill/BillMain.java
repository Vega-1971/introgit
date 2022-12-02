package attributes.bill;

import attributes.book.Book;

public class BillMain {

    public static void main(String[] args) {

        Bill bill_1 = new Bill("Váza", 1200, 10, 27);

        System.out.println(bill_1.calculateTotalPrice());
    }
}
