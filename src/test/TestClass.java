package test;
import products.Product;
import staff.Cashier;
import staff.Manager;

public class TestClass {
    public static void main(String[] args) {
        //managers
        Manager manager=new Manager("harry", 123456,"Ajah");
        manager.hireCashier(new Cashier("angela",1,"lekki"));
        //products
        Product product1 = new Product("short",50.0);
        Product product2 = new Product("shirt",40.0);
        Product product3 = new Product("shoe",70.0);
        Cashier.products.add(product1);
        Cashier.products.add(product2);
        Cashier.products.add(product3);
        //cashiers
        manager.cashiers.get(0).sellProduct(product2);
        System.out.println();

        System.out.println(Cashier.products);
    }
}
