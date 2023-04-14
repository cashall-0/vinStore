package models;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@ToString
@Setter
@Getter

public class Order {
    private String customerName;
    private BigDecimal customerBalance;
   // private Product product;
    private String productName;
    private int quantity;
    public Order(Customer customer, String productName, int quantity) {
        this.productName = productName;
        this.customerName = customer.getName();
        this.customerBalance = customer.getBalance();
  //      this.product = productSearch(productName);
        this.quantity = quantity;
    }
//    private Product productSearch(String productName){
//        for (Product product: Store.products
//        ) {if(product.getName().equals(productName))
//            return product;
//        }
//        return null;
//    }
}
