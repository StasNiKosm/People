package derivatives.peaceful;

import common.Person;

public class Inventor extends Person {

    private int experience;

    public Inventor(String name, int health, int hit, int experience) {
        super(name, health, hit);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
