package campus02.pr2.Uebung0407.Vererbung;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(100);
        Address address = new Address("Schoenaugasse", "8010", "Graz", "Austria");

        System.out.println(customer);
        customer.addAddress(address);

        System.out.println(customer);
    }
}
