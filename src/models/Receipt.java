package models;

public class Receipt extends Product {
    public Receipt(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "name="+ name+"  "+
                "price=" + price +
                '}';
    }
}
