package hw04;

public class Employee {
        private String firstname, lastname, position, phone;
        private float salary;
        private int age;
        private Gender gender;

    public Employee(String firstname, String lastname, String position, String phone, float salary, int age, Gender gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Employee: {" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", position='" + position + '\'' +
                ", phone=" + phone +
                ", salary=" + salary +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
