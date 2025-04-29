package campus02.pr2.Uebung0407.Vererbung;

public class Person {

    String firstName;
    String lastName;

    public Person() {
        System.out.println("Person object is created");
    }

    public void doSomething () {
        System.out.println("Hallo! I'm " + firstName);
    }

}
