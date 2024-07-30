package lesson03;

public class Employee /*implements Comparable<Employee>*/ {
    private String firstname;
    private String lastname;
    private String position;
    private int phone;
    private float salary;
    private int age;

    public Employee(String firstname, String lastname, String position, int phone, float salary, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void increaseSalary(int amount) {
        this.salary += amount;
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
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

    @Override
    public String toString() {
        return STR."Employee: firstname: \{firstname}, lastname: \{lastname}, position: \{position}, phone: \{phone}, salary: \{salary}, age: \{age}";
    }

//    public int compare(Employee o) {
//        if (o.equals())
//        return this.getAge() - o.getAge();
//    }

//    @Override
//    public int compareTo(Employee o) {
//        return this.getAge() - o.getAge();
//    }
}
