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

    @Override
    void jump(){
        System.out.println(STR."Snake \{name} cannot jump, it is a snaaaaake");
    }

    static void run(Animal animal){
        if (animal instanceof Snake)
        System.out.println(STR."Snake cannot run, it is a snaaaaake");
    }
}
