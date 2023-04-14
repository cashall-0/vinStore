package models;

import enums.Gender;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;

@ToString
@Setter
@Getter
public abstract class Person {
    private long id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private String address;
    private String role;

    public Person(String firstName,String lastName, long id, String address, String role, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.address = address;
        this.role = role;
        this.gender=gender;
    }
    public Person(String firstName,String lastName, String address, String role,Gender gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.role = role;
        this.gender=gender;
    }

    public Person() {
    }
}
