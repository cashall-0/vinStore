package models;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;

@ToString
@Setter
@Getter
public class Product {
    private String name;
    private double price;
    private int productId;
    private int quantityInStock;




    public Product(String name, double price,int id,int quantity) {
        this.name = name;
        this.price= price;
        this.productId = id;
        this.quantityInStock =quantity;
    }
}
