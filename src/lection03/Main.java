package lection03;

public class Main {
    public static void main(String[] args) {

        Animal cat1 = new Cat("Barsik", "White", 2021, 1);
        Cat.swim(cat1); // Cats do not like swim!!!
        cat1.jump(4); // Barsik jumps 4 times
        cat1.run(17); // Barsik runs 17 times

        Animal dog1 = new Dog("Stan", "Black", 2012);
        dog1.jump("grass"); // Stan cannot jump to grass because it is old animal
        dog1.run(55); // Stan runs 55 times

        Animal snake1 = new Snake("Kaa", "Stripes", 2021);
        snake1.jump(); // Snake Kaa cannot jump, it is a snaaaaake
        Snake.run(snake1); // Snake cannot run, it is a snaaaaake



        // создание объекта без конструктора
//        Cat cat1 = new Cat();
//        Cat cat2 = new Cat();
//        cat1.name = "Barsik"; cat1.color = "White";
//        cat1.age = 4;
//        cat2.name = "Murzik"; cat2.color = "Black";
//        cat2.age = 6;
//        System.out.println(STR."Cat 1, name: \{cat1.name} color: \{cat1.color} age: \{cat1.age}");
//        System.out.println(STR."Cat 2, name: \{cat2.name} color: \{cat2.color} age: \{cat2.age}");

//        System.gc(); // garbage collector

//        // создание объекта с конструктором, со всеми параметрами
//        Cat cat1 = new Cat("Barsik", "White", 2019);
//        Cat cat2 = new Cat("Murzik", "Black", 2015);
//        System.out.println(STR."Cat 1, name: \{cat1.name} color: \{cat1.color} age: \{cat1.age}");
//        System.out.println(STR."Cat 2, name: \{cat2.name} color: \{cat2.color} age: \{cat2.age}");
//        // создание объекта с конструктором, с двумя параметром
//        Cat cat3 = new Cat("Mashka");
//        System.out.println(STR."This is \{cat3.name} and it's age: \{cat3.age}");
        // создание объекта с конструктором и getter/setter
//        System.out.println(STR."Cat 1, name: \{cat1.getName()} color: \{cat1.getColor()} age: \{cat1.getAge()}");
//        System.out.println(STR."Cat 2, name: \{cat2.getName()} color: \{cat2.getColor()} age: \{cat2.getAge()}");
    }
}
