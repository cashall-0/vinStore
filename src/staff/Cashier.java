package staff;
import customers.Customer;
import products.Receipt;
import products.Product;

import java.util.ArrayList;

public class Cashier extends Staff {
    public static ArrayList<Product> products;
    public ArrayList<Receipt> receipts;
    public Cashier(String name, long id, String address) {
        super(name, id, address);
        Cashier.products=new ArrayList<>();
        this.receipts=new ArrayList<>();

    }
    //methods
    public boolean sellProduct(Product product){
        dispenseReceipt(product);
        Customer.purchase(product);
        return products.remove(product);
    }
    public Receipt dispenseReceipt(Product product){
        Receipt receipt=new Receipt(product.name, product.price);
        receipts.add(receipt);
        System.out.println(receipt.toString()+"     this is receipt");
        return receipt;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
}
