package models;
import java.util.ArrayList;
import java.util.List;

public class Store {
    public static ArrayList<Product> products = new ArrayList<>();
    //todo refactor this code
    static{
        products.addAll(List.of(
                new Product("shoes",50.0, 1, 500),
                new Product("shirt",75.0, 2, 500),
                new Product("belt",80.0, 3, 500),
                new Product("socks",80.0, 3, 500),
                new Product("cap",80.0, 3, 500),
                new Product("singlet",80.0, 3, 500),
                new Product("denim",80.0, 3, 500)
        ));
    }
}

