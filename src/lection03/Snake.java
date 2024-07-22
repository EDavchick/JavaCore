package lection03;

public class Snake extends Animal{
    public Snake(String name, String color, int birthYear) {
        super(name, color, birthYear);
    }

    @Override
    void voice() {
        System.out.println(STR."\{name} hhhhhhhhhh");
    }

    @Override
    void move() {
        System.out.println(STR."\{name} crawls");
    }
}
