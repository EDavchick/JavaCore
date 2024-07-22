package lection03;

public class Dog extends Animal {
    static int pawsCount = 4;
    public Dog(String name, String color, int birthYear) {
        super(name, color, birthYear);
    }

    @Override
    void voice() {
        System.out.println(STR."\{name} woof");
    }

}
