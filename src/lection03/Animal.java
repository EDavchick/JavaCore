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

    void jump() {
        if (this.getBirthYear() < 5) {
            System.out.println(STR."\{name} jump");
        }
    }
    void jump(String place) {
        if (this.getBirthYear() < 5) {
            System.out.println(STR."\{name} jumps to \{place}");
        }
    }
    void jump(int count) {
        if (this.getBirthYear() < 5) {
            System.out.println(STR."\{name} jumps \{count} times");
        }
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
