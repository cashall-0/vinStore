package products;

public class Product {
    public static String name;
    public static double price;

    public Product(String name, double price) {
        Product.name = name;
        Product.price = price;
    }

    @Override
    public String toString() {
        return "name: "+name+";  price: "+price;
    }
}
