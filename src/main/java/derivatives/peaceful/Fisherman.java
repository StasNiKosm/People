package derivatives.peaceful;

import common.Person;

public class Fisherman extends Person {

    public Fisherman(String name, int health, int hit) {
        super(name, health, hit);
    }

    @Override
    public void say() {
        System.out.println("I'm a fisherman");
    }
}
