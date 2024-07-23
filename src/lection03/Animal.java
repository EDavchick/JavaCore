package lection03;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int birthYear;

    public Animal(String name, String color, int birthYear) {
        this.name = name;
        this.color = color;
        this.birthYear = birthYear;
    }

    void swim(int distance){
        if (this.getBirthYear() < 7) {
            System.out.println(STR."\{name} runs \{distance} times");
        }
        else System.out.println(STR."\{name} cannot run because it is old animal");
    }
    void run(int distance) {
        if (this.getBirthYear() < 7) {
            System.out.println(STR."\{name} runs \{distance} times");
        }
        else System.out.println(STR."\{name} cannot run because it is old animal");
    }
    void jump() {
        if (this.getBirthYear() < 7) {
            System.out.println(STR."\{name} jump");
        }
    }
    void jump(String place) {
        if (this.getBirthYear() < 7) {
            System.out.println(STR."\{name} jumps to \{place}");
        }
        else System.out.println(STR."\{name} cannot jump to \{place} because it is old animal");
    }

    void jump(int count) {
        if (this.getBirthYear() < 7) {
            System.out.println(STR."\{name} jumps \{count} times");
        }
        else System.out.println(STR."\{name} cannot jump because it is old animal");
    }
    abstract void voice();

    void move(){
        System.out.println(STR."\{name} walks on paws");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBirthYear() {
        return 2024 - birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

}
