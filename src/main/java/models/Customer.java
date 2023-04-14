package models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import lombok.ToString;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@ToString
public class Customer{
    private String name;
    private BigDecimal balance;
    private List<Order> cart;

    public Customer(String name, BigDecimal balance){
       this.name = name;
       this.balance = balance;
       this.cart = new ArrayList<>();

    }
}
