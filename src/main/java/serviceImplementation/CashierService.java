package serviceImplementation;
import models.Customer;
import models.Order;
import models.Product;
import models.Store;
import serviceInterface.ICashier;
import java.math.BigDecimal;


public class CashierService implements ICashier {
    @Override
    public String sellProduct(Customer customer) {
        double sumOfProduct = cartTotal(customer);
        BigDecimal bSumOfProduct = new BigDecimal(sumOfProduct);
        System.out.println("sum of products: "+ sumOfProduct);
        if(customer.getBalance().compareTo(bSumOfProduct)>=0){
            customer.setBalance(customer.getBalance().subtract(bSumOfProduct));
            System.out.println("Successfully sold products in cart");
            return "Products sold";
        }else {
            System.out.println("insufficient funds");
            return "Products not sold";
        }
    }
    private double cartTotal(Customer customer){
        double sum = 0.0;
        for (Order order: customer.getCart()) {
            Product product = productSearch(order.getProductName());
            if(product!=null){
            sum += order.getQuantity() * product.getPrice();
            }
        }
        return sum;
    }
    //add order to cart
    public String addToCart(Order order, Customer customer){
        Product product = productSearch(order.getProductName());
        if(product != null){
            if(order.getQuantity() <= product.getQuantityInStock()) {
               if(cartSearch(order,customer)>-1){
                   if(order.getQuantity()+customer.getCart().get(cartSearch(order,customer)).getQuantity() <= product.getQuantityInStock()) {
                       customer.getCart().get(cartSearch(order, customer)).setQuantity(customer.getCart().get(cartSearch(order, customer)).getQuantity() + order.getQuantity());
                       System.out.println("added product: " + order.getProductName() + "    quantity: " + order.getQuantity() + " to existing in cart");
                   }else
                       System.out.println("Not enough in stock");
               }else{
                   customer.getCart().add(order);
                   System.out.println("added product: " + order.getProductName() + "    quantity: " + order.getQuantity()+ " to cart");
               }
            }else
                System.out.println("product is out of stock");
        }else
            System.out.println("product not in store");
        return "done";
    }
    private int cartSearch(Order order,Customer customer){
        for (Order cOrder: customer.getCart()) {
            if(cOrder.getProductName().equals(order.getProductName()))
                return customer.getCart().indexOf(cOrder);
        }
        return -1;
    }

    private Product productSearch(String productName){
        for (Product product: Store.products
        ) {if(product.getName().equals(productName))
            return product;
        }
        return null;
    }
}
