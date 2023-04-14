import enums.Gender;
import models.*;
import models.Customer;
import serviceImplementation.CashierService;
import serviceImplementation.ManagerService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class TestClass {
    public static void main(String[] args) {
//       ManagerService managerService = new ManagerService();
//       Applicant applicant = new Applicant("micheal","Carrick","oko umuahai island ",23, 3,"sales", Gender.MALE);
////        Applicant applicant4 = new Applicant("ugoo","rick","oko umuahai island ",23, 3,"sales", Gender.Male);
//        Applicant applicant2 = new Applicant("mich","Carrick","oko umuahai island ",10, 2,"sales", Gender.Male);
//        Applicant applicant3 = new Applicant("helen","Carr","oko umuahai island ",25, 0,"sales", Gender.female);
//        Cashier hiredCashier = managerService.hireCashier(applicant,1);
//       managerService.hireCashier(applicant2,2);
//       managerService.hireCashier(applicant3,3);
//       managerService.hireCashier(applicant4,4);
//        System.out.println(hiredCashier);
//        System.out.println(managerService.fireCashier("micheal"));
//        System.out.println(managerService.fireCashier("uche"));
//        System.out.println(Manager.cashiers.toString());
//        Product seasoning = new Product("maggi",50.0, 1, 500);
//        Store.products.add(seasoning);
//        System.out.println(seasoning.getQuantityInStock());
        Customer customer = new Customer("chiamaka", new BigDecimal(40000));
//        Customer customer1 = new Customer("jane", new BigDecimal(14000));
//        Customer customer2 = new Customer("eric", new BigDecimal(14000));
        CashierService cashierService = new CashierService();
//        cashierService.sellProduct("shoes", 200, customer);
//        cashierService.sellProduct("shoes", 200, customer1);
//        cashierService.sellProduct("shoes", 200, customer2);
//        cashierService.sellProduct("shirt", 100, customer);
//        cashierService.sellProduct("socks", 100, customer);
//        for(Product product:Store.products) {
//            System.out.println(product);
//        }
//        System.out.println(customer);
//        System.out.println(customer1);
//        System.out.println(customer2);

        Order order1 = new Order(customer,"shoes",5);
        Order order2 = new Order(customer,"shoes",50);
        Order order3 = new Order(customer,"shirt",5);
        Order order4 = new Order(customer,"shirts",200);
        Order order5 = new Order(customer,"shoes",500);
        Order order6 = new Order(customer,"shirt",200);
        Order order7 = new Order(customer,"socks",400);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
        System.out.println(order4);
        System.out.println(order5);
        System.out.println(order6);
        System.out.println(order7);

        cashierService.addToCart(order1,customer);
       // System.out.println(customer);
        cashierService.addToCart(order2, customer);
       // System.out.println(customer);
        cashierService.addToCart(order3, customer);
       // System.out.println(customer);
        cashierService.addToCart(order4, customer);
       // System.out.println(customer);
        cashierService.addToCart(order5, customer);
        //System.out.println(customer);
        cashierService.addToCart(order6, customer);
        cashierService.addToCart(order7, customer);
        customer.getCart().forEach(System.out::println);
        System.out.println("balance before purchase:  "+ customer.getBalance());
        System.out.println(cashierService.sellProduct(customer));
        System.out.println("balance after purchase:  "+ customer.getBalance());
//
//
//        Manager manager = Manager.managerInstance("harry", "okpara",1234L, "asdfghjkl;difs", "manager", Gender.MALE);
//        Manager mana = Manager.managerInstance("potter", "terry",1234L, "asdfghjkl;difs", "manager", Gender.MALE);
//        System.out.println(manager);
//        System.out.println(mana);
    }
}
