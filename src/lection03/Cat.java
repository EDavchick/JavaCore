package lection03;

public class Cat extends Animal {
    static int pawsCount = 4;


    public Cat(String name, String color, int birthYear) {
        super(name, color, birthYear);
    }

    @Override
    void voice() {
        System.out.println(STR."\{name} meow");
    }
}
