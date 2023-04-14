package serviceInterface;

import models.Applicant;
import models.Cashier;

public interface Imanager {
    Cashier hireCashier(Applicant applicant, int id);
    boolean fireCashier(String cashierName);
}
