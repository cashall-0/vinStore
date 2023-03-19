package serviceImplementation;

import models.Receipt;
import models.Stock;
import serviceInterface.Icashier;

public class Cashier extends models.Cashier implements Icashier {
    public Cashier(String name, long id, String address) {
        super(name, id, address);
    }

    @Override
    public void sellProduct(Stock stock) {
        System.out.println(stock.toString()+" has been sold");
        dispenseReceipt(stock);
    }

    @Override
    public void dispenseReceipt(Stock stock) {
        Receipt receipt = new Receipt(stock.name, stock.price);
        receipts.add(receipt);
        System.out.println(receipt);
    }
}
