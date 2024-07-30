package lesson03;

public class Manager extends Employee {
    public Manager(String firstname, String lastname, String position, int phone, float salary, int age) {
        super(firstname, lastname, position, phone, salary, age);
    }

    protected static void increaser(Employee[] emp) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getPosition() != "director") {
                emp[i].increaseSalary(5000);
//            System.out.println(emp[i]);
            }
        }
    }

}
