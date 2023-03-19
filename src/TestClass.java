import models.Stock;
import serviceImplementation.Manager;
import serviceImplementation.Cashier;

public class TestClass {
    public static void main(String[] args) {
        Manager manager =new Manager("mike",2345L,"oshodi");
        Cashier cashier1=new Cashier("jules",123456,"abulodu");
        manager.hireCashier(new Cashier("ruth",12345,"abulodu"));
        manager.hireCashier(cashier1);
        manager.fireCashier(cashier1);
        Stock shorts = new Stock("shorts",50.0);
        cashier1.sellProduct(shorts);
    }
}
