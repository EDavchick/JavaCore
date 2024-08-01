package lesson03;


import java.lang.reflect.Method;
import java.util.*;

import static lesson03.Manager.increaser;

public class Main {
    public static void main(String[] args) {
//        var a = Math.class;
//        Random random = new Random();
//        Class<?> b = random.getClass();
//
//        for (Method declaredMethods : b.getDeclaredMethods()) {
//            System.out.println(declaredMethods);
//        }


        // Создать массив из 5 сотрудников
//        Employee[] company = new Employee[5];
//        company[0] = new Employee("Ivan", "Petrov", "manager", 9876543, 30000, 35);
//        company[1] = new Employee("Maria", "Petrova", "accountant", 8765433, 35000, 34);
//        company[2] = new Employee("Petr", "Ivanov", "driver", 4567893, 15000, 28);
//        company[3] = new Employee("Elena", "Danilova", "developer", 7654321, 40000, 45);
//        company[4] = new Employee("Nadezhda", "Filimonova", "director", 4567890, 56000, 53);

        Employee[] company = {
                new Employee("Ivan", "Petrov", "manager", 9876543, 30000, 35),
                new Employee("Maria", "Petrova", "accountant", 8765433, 35000, 34),
                new Employee("Petr", "Ivanov", "driver", 4567893, 15000, 28),
                new Employee("Elena", "Danilova", "developer", 7654321, 40000, 45),
                new Employee("Nadezhda", "Filimonova", "director", 4567890, 56000, 53)
        };

        printEmployees(company);
        System.out.println();
        increaser(company);
        printEmployees(company);
        System.out.println();
        compareEmp(company);

//        System.out.println(averageAge(company));
//        System.out.println(averageSalary(company));

//        getList(company);
//        System.out.println(company);
    }

    private static void printEmployees(Employee[] emp) {
        for (Employee e : emp) {
            System.out.println(e);
        }
    }
//    private static void increaser(Employee[] emp) {
//        for (int i = 0; i < emp.length; i++) {
//            if (emp[i].getAge() > 40) {
//                emp[i].increaseSalary(5000);
////            System.out.println(emp[i]);
//            }
//        }
//    }

    private static float averageSalary(Employee[] emp) {
        float result = 0;
        for (int i = 0; i < emp.length; i++)
            result += emp[i].getSalary();

        return result / emp.length;
    }

    private static float averageAge(Employee[] emp){
        float result = 0;
        for (int i = 0; i < emp.length; i++)
            result += emp[i].getAge();

        return result / emp.length;
    }

    private static List<Employee> getList(Employee[] emp) {
        List<Employee> listEmp = new ArrayList<>(Arrays.asList(emp));
        System.out.println(listEmp);
        return listEmp;
    }

    private static void compareEmp(Employee[] emp) {
//        int temp[] = new int[emp.length];
        for (int i = 0; i < emp.length - 1; i++) {
            emp[i].compare(emp[i + 1]);
//            emp[i] = emp[i + 1];
            System.out.println(emp[i]);
        }
    }
}
