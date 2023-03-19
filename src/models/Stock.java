package models;

public class Stock extends Product {
    public Stock(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name="+ name+"  "+
                "price=" + price +
                '}';
    }
}
