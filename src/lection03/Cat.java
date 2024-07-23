package lection03;

public class Cat extends Animal {
    static int pawsCount = 4;
    private int id;

    public Cat(String name, String color, int birthYear, int id) {
        super(name, color, birthYear);
        this.id = id;
    }

    static void swim(Animal a) {
        if(a instanceof Cat){
            System.out.println("Cats do not like swim!!!");
        }
    }

    @Override
    void voice() {
        System.out.println(STR."\{name} meow");
    }
}
