package serviceInterface;
import models.Stock;

public interface Icashier {
    void sellProduct(Stock product);
    void dispenseReceipt(Stock product);
}
