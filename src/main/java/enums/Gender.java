package enums;

public enum Gender {
    MALE("This is a male enum"), FEMALE("This is a female enum");

    public  String value ;

    private Gender(String value){
        this.value = value;
    }

}
