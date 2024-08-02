package hw04;


public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ivan", "Petrov", "manager", "9876543", 30000, 35, Gender.MALE),
                new Employee("Maria", "Petrova", "accountant", "8765433", 35000, 34, Gender.FEMALE),
                new Employee("Petr", "Ivanov", "driver", "4567893", 15000, 28, Gender.MALE),
                new Employee("Elena", "Danilova", "developer", "7654321", 40000, 45, Gender.FEMALE),
                new Employee("Nadezhda", "Filimonova", "director", "4567890", 56000, 53, Gender.FEMALE)
        };
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }

        Object[][] info = {
                {buyers[0], products[0], 1}, //good
                {buyers[1], products[1], -1}, //bad amount -1
                {buyers[0], products[2], 150}, //bad amount >100
                {buyers[1], new Product("Flower", 10), 1}, //no product
                {new Buyer("Pasha", "Malikov", "+3-444-555-66-77", 40, Gender.MALE), products[3], 1}, //no buyer
        };
//        int capacity = 0;
//        int i = 0;
//        while (capacity != orders.length - 1 || i != info.length)
//
//        {
//            try {
//                orders[capacity] = makeOrder((Buyer) info[i][0], (Product) info[i][1], (int) info[i][2]);
//                capacity++;
//            } catch (ProductException e) {
//                e.printStackTrace();
//            } catch (AmountException e) {
//                orders[capacity++] = makeOrder((Buyer) info[i][0], (Product) info[i][1], 1);
//            } catch (CustomerException e) {
//                throw new RuntimeException(e);
//            } finally {
//                System.out.println(STR."Orders made: \{capacity}");
//            }
//            ++i;
//        }

        getCongratulition(employees);

    }

    private static void getCongratulition(Employee[] employees){
        for (Employee e : employees) {
            if (e.getGender() == Gender.MALE)
                System.out.println(STR."Congratulations on 23 of February, \{e.getFirstname()}!");
            if (e.getGender() == Gender.FEMALE)
                System.out.println(STR."Congratulations on 8 of March, \{e.getFirstname()}!");
        System.out.println(STR."Happy new year, \{e.getFirstname()}!!!");

//            switch (Holidays.NONE) {
//                case Holidays.FEBRUARY_23:
//                    if (e.getGender() == Gender.MALE)
//                        System.out.println(STR."Congratulations on 23 of February, \{e.getFirstname()}!");
//                    break;
//                case Holidays.MARCH_08:
//                    if (e.getGender() == Gender.FEMALE)
//                        System.out.println(STR."Congratulations on 8 of March, \{e.getFirstname()}!");
//                    break;
//                case Holidays.NEW_YEAR:
//                    System.out.println(STR."Happy new year, \{e.getFirstname()}!!!");
//                    break;
//                default:
//                    System.out.println("Nothing to celebrate...");
//            }
        }
    }

    // Создать массив покупателей
    private static Buyer [] buyers = {
            new Buyer("Masha", "Ivanova", "3553355", 35, Gender.FEMALE),
            new Buyer("Natasha", "Petrova", "7563311", 32, Gender.FEMALE),
            new Buyer("Katya", "Bobrova", "8451199", 48, Gender.FEMALE),
            new Buyer("Petya", "Mashkov", "3218866", 42, Gender.MALE),
            new Buyer("Fedya", "Popov", "5427613", 38, Gender.MALE)
    };
    // Создать массив товаров
    private static Product[] products = {
            new Product("Pomade", 3500),
            new Product("Mascara", 6450),
            new Product("Perfume", 14250),
            new Product("Cosmetic bag", 200),
            new Product("Barrette", 1700)
    };
    // Создать  массив заказов (пустой на 5 элементов)
    private static Order[] orders = new Order[5];

// Создать статический метод «совершить покупку» со строковыми параметрами,
//соответствующими полям объекта заказа. Метод должен вернуть объект заказа
    private static boolean isInArray(Object[] arr, Object o) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals(o)) return true;
        return false;
    }
    public static Order makeOrder(Buyer who, Product what, int howMuch){
        if (!isInArray(buyers, who))
            throw new CustomerException(STR."Unknown user: \{who}");
        if (!isInArray(products, what))
            throw new ProductException(STR."Unknown product: \{what}");
        if (howMuch < 0 || howMuch > 100)
            throw new AmountException(STR."Incorrect amount: \{howMuch}");
        return new Order(who, what, howMuch);
    }
}

