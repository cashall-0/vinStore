package serviceImplementation;

import models.Applicant;
import models.Cashier;
import models.Manager;
import serviceInterface.Imanager;

public class ManagerService implements Imanager {


    @Override
    public Cashier hireCashier(Applicant applicant, int id) {
        Cashier cashier = new Cashier();
        //hire applicant with 2yrs experience or more also above 18yrs old or more
        if (applicant.getAge() > 18 && applicant.getAge() < 35) {
            if (applicant.getYrsOfExperience() > 2) {
                //hire cashier
                cashier.setFirstName(applicant.getFirstName());
                cashier.setLastName(applicant.getLastName());
                cashier.setId(id);
                cashier.setAddress(applicant.getAddress());
                cashier.setRole(applicant.getRole());
                cashier.setGender(applicant.getGender());
                Manager.cashiers.add(cashier);
                System.out.println("hired a cashier");
                return cashier;
            } else {
                System.out.println("not enough experience");
            }
        } else {
            System.out.println("too young");
        }
        return null;
    }

    @Override
    public boolean fireCashier(String cashierName) {
        if(searchCashier(cashierName)>-1){
            Cashier fCashier = Manager.cashiers.get(searchCashier(cashierName));
            System.out.println("contract terminated:  for "+cashierName);
            return Manager.cashiers.remove(fCashier);
        }
        return false;
    }
    private int searchCashier(String cashierName){
        for (Cashier cashier : Manager.cashiers) {
            if (cashier.getFirstName().equals(cashierName) || cashier.getLastName().equals(cashierName)) {

                return Manager.cashiers.indexOf(cashier);
            }
        }
        return -1;
    }
}