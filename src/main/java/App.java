import common.Person;
import derivatives.peaceful.Builder;
import derivatives.peaceful.Fisherman;
import derivatives.peaceful.Peasant;
import derivatives.troops.Knight;
import derivatives.troops.Rider;

public class App {

    public static void main(String[] args) {
        Person[] people = new Person[]{new Fisherman("Oscar", 100, 5), new Builder("Tom", 100, 5),
                new Knight("Os", 100, 5), new Rider("Mark", 100, 5),
                new Peasant("Mor", 100, 5, 40)};
        for (Person person: people) {
            person.say();
        }
    }
}
