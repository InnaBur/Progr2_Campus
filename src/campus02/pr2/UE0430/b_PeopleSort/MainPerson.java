package campus02.pr2.UE0430.b_PeopleSort;

import java.util.Arrays;

public class MainPerson {

    public static void main(String[] args) {
        System.out.println("Persons: ");

        Person[] persons = {
                new Person(55, "Anna", "A"),
                new Person(123, "Pit", "P"),
                new Person(5, "Bob", "B"),
                new Person(78, "Mary", "M")

        };

        System.out.println(Arrays.toString(persons));

        Arrays.sort(persons);
        System.out.println("Sortiertes Array: ");
        System.out.println(Arrays.toString(persons));


    }
}
