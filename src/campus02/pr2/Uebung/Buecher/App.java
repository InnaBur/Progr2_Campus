package campus02.pr2.Uebung.Buecher;

public class App {

    public static void main(String[] args) {

        Book book = new Book("Harry Potter", "JK Rowling", "ibsn123");
        Fossilien fossilien = new Fossilien("Stone", 100);
        Fossilien fossilien2 = new Fossilien("Stone2", 1000);
        Fossilien fossilien3 = new Fossilien("Stone3", 10);
        Box box = new Box();
        System.out.println(book);

        box.putBook(book);
        box.printContents();

        Box box1 = new Box();
        box1.putFoss(fossilien);
        box1.putFoss(fossilien2);
        box1.putFoss(fossilien3);
        box1.putFoss(fossilien);
        box1.putFoss(fossilien2);
        box1.putFoss(fossilien3);
        box1.putFoss(fossilien);
        box1.putFoss(fossilien2);
        box1.putFoss(fossilien3);
        box1.putFoss(fossilien);
        box1.putFoss(fossilien);
        box1.printContentsFos();

        box.putFoss(fossilien);
        System.out.println("Box with books and foss ");
        box.printContents();

    }
}
