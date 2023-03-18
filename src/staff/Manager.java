package staff;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Staff {
    public List<Cashier> cashiers;
    public Manager(String name, long id, String address) {
        super(name, id, address);
        this.cashiers=new ArrayList<>();
    }
    // manager methods
    public boolean hireCashier(Cashier cashier){
        System.out.println("cashier added by manager");
        return this.cashiers.add(cashier);
    }
    public boolean fireCashier(Cashier cashier){
        System.out.println("cashier fired by manager");
        return this.cashiers.remove(cashier);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "cashiers=" + cashiers +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
}
