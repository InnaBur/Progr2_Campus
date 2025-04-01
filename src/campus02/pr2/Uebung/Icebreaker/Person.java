package campus02.pr2.Uebung.Icebreaker;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private final String firstName;
    private final String lastName;
     List<Favourite> favourite;

    public Person(String firstName, String lastName, List<Favourite> favourite) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favourite = favourite;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favourite = new ArrayList<>();
    }

    public String listToString() {
        String s = "";

        for (Favourite favourite1: favourite) {
            s = s + " " +  favourite1.getMedium() + " " +  favourite1.getTitle() + " ";
           if (favourite1.getComment() != null) {
               s += favourite1.getComment() + " ";
           }
        }
        return s;
    }
    public String introduceMe() {
        return "Ich bin " +  firstName + " " +  lastName + ". My favourite mediums are: " +
                listToString();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Favourite> getFavourite() {
        return favourite;
    }

    public void setFavourite(Medium medium, String titel) {
        favourite.add(new Favourite(medium, titel));
    }

    public void setFavourite(Medium medium, String titel, String comment) {
        favourite.add(new Favourite(medium, titel, comment));
    }
}
