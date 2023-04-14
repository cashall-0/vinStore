package models;


import enums.Gender;

import java.util.ArrayList;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;

@ToString
@Setter
@Getter

public class Manager{

    private long id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private String address;
    private String role;

    private static Manager mInstance;
    public static ArrayList<Cashier> cashiers=new ArrayList<>();
    private Manager(String firstName, String lastName, long id, String address, String role, Gender gender) {
        this.firstName=firstName;
        this.lastName = lastName;
        this.id = id;
        this.address = address;
        this.role = role;
        this.gender = gender;
    }

    public static Manager managerInstance(String firstName, String lastName, long id, String address, String role, Gender gender) {
        if(mInstance==null)
            mInstance = new Manager(firstName, lastName, id, address, role, gender);
        return mInstance;
    }
}
