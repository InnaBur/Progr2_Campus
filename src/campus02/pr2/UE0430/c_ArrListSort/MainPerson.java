package campus02.pr2.UE0430.c_ArrListSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainPerson {

    public static void main(String[] args) {
        System.out.println("Persons: ");

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person(55, "Anna", "A"));
        persons.add(new Person(123, "Pit", "P"));
        persons.add(new Person(5, "Bob", "B"));
        persons.add(new Person(78, "Mary", "M"));
        System.out.println("List: ");
        for (Person person: persons) {
            System.out.println(person);
        }

        Collections.sort(persons);
        System.out.println("Sortiertes List: ");
        for (Person person: persons) {
            System.out.println(person);
        }


}
}
