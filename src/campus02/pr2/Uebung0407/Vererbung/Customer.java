package campus02.pr2.Uebung0407.Vererbung;

import java.util.ArrayList;

public class Customer extends Person{

    private final int customerNumber;
    private final ArrayList<Address> addresses;
    

    public Customer(int customerNumber) {
        this.customerNumber = customerNumber;
        System.out.println("Customer object is created");
        this.addresses = new ArrayList<>();
    }

    public void addAddress (Address a) {
        addresses.add(a);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", addresses=" + addresses +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
