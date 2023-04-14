package models;

import enums.Gender;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;

@ToString
@Setter
@Getter
public class Applicant extends Person {
    private int age;
//    private String role;
    private int yrsOfExperience;

    public Applicant(String firstName, String lastName, String address, int age, int yrsOfExperience, String role, Gender gender){
        super(firstName, lastName, address, role, gender);
        this.age = age;
        this.yrsOfExperience = yrsOfExperience;
    }

}
