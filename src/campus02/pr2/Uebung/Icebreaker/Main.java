package campus02.pr2.Uebung.Icebreaker;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Alice", "All");
        person1.setFavourite(Medium.BOOK, "Little Prince");
        person1.setFavourite(Medium.FILM, "Intouchables", "!Super Film!");
        System.out.println(person1.introduceMe());

        Person person2 = new Person("Bob", "Barn");
        person2.setFavourite(Medium.SERIES, "Black Mirror");
        person2.setFavourite(Medium.SERIES, "Dexter", "!Super Film!");
        System.out.println(person2.introduceMe());

        Person person3 = new Person("Clara", "Car");
        person3.setFavourite(Medium.MAGAZINE, "Perfect Deutsch");
        System.out.println(person3.introduceMe());
    }



}
