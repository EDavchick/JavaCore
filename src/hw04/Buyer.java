package hw04;

import lombok.Data;

@Data
public class Buyer {
    private String firstname, lastname, phone;
    private int age;
    private final Gender gender;

    public Buyer(String firstname, String lastname, String phone, int age, Gender gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Buyer: {" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
