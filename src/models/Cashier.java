package models;

import java.util.ArrayList;

public class Cashier extends Person {
    public static ArrayList<Product> products;
    public ArrayList<Receipt> receipts;
    public Cashier(String name, long id, String address) {
        this.name=name;
        this.id=id;
        this.address=address;
        this.receipts=new ArrayList<>();
    }
}
