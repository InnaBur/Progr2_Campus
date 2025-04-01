package campus02.pr2.Uebung.Generics;

import campus02.pr2.Uebung.Buecher.Book;
import campus02.pr2.Uebung.Buecher.Fossilien;

import java.util.Arrays;

public class GenericsArchive {

    public static void main(String[] args) {
        GenericBox<Book> books = new GenericBox<>();
        GenericBox<Fossilien> fossilienGenericBox = new GenericBox<>();

        Book book = new Book("Harry Potter", "JK Rowling", "ibsn123");
        Fossilien fossilien = new Fossilien("etwas", 10);

        books.putItem(book);
        books.printContents();

        fossilienGenericBox.putItem(fossilien);
        fossilienGenericBox.printContents();

        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.putItem(10);
        intBox.putItem(100);
        intBox.printContents();

        GenericPrinter<Book> bookPrinter = new GenericPrinter<>();
        bookPrinter.druck(book);


    }
}
