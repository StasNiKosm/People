package common;


public abstract class Person implements Man{
    private String name;
    private int health;
    private int hit;

    public Person(String name, int health, int hit) {
        this.name = name;
        this.health = health;
        this.hit = hit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public void say() {
        System.out.println("I'm a model");
    }
}
