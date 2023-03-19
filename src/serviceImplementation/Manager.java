package serviceImplementation;


import models.Cashier;
import serviceInterface.Imanager;

import java.util.ArrayList;

public class Manager extends models.Manager implements Imanager {
    public ArrayList<Cashier> cashiers = new ArrayList<>();

    public Manager(String name, Long id, String address) {
        super(name, id, address);
    }

    @Override
    public boolean hireCashier(Cashier cashier) {
        if(this.cashiers.add(cashier)){
            System.out.println("cashier added");
            return true;
        }
        return false;
    }

    @Override
    public boolean fireCashier(Cashier cashier) {
        if(this.cashiers.remove(cashier)){
            System.out.println("cashier removed");
            return true;
        }
        return false;
    }
}