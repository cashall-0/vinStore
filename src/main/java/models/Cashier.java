package models;
import enums.Gender;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;

@ToString
@Setter
@Getter
public class Cashier extends Person {
    public Cashier(String firstName, String lastName, long id, String address, String role, Gender gender) {
        super(firstName, lastName, id, address, role, gender);
    }
    public Cashier(){}
}
