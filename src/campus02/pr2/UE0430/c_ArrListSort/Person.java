package campus02.pr2.UE0430.c_ArrListSort;

public class Person implements Comparable<Person> {

    int id;
    String name;
    String lastName;

    public Person(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        Person p1 = this;
        if (p1.id < o.id) { return -1;}
        if (p1.id > o.id) { return 1; }
        return 0;
    }

}
