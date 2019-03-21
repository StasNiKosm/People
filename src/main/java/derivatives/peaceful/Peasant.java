package derivatives.peaceful;

import common.Person;

public class Peasant extends Person {
    private int harvest;

    public Peasant(String name, int health, int hit, int harvest) {
        super(name, health, hit);
        this.harvest = harvest;
    }

    public int getHarvest() {
        return harvest;
    }

    public void setHarvest(int harvest) {
        this.harvest = harvest;
    }

    @Override
    public void say() {
        System.out.println("Hi!) WELCOME to my home)");
    }
}
