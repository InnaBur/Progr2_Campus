package campus02.pr2.Uebung.Lists;

import campus02.pr2.Uebung.Buecher.Book;

import java.util.ArrayList;
import java.util.List;

public class ReadingList {
    public static void main(String[] args) {

        List<Book> toBeRead = new ArrayList<>();
        List<Book> alreadyRead = new ArrayList<>();

        Book hp1 = new Book("Harry Potter 1", "JK Rowling", "1");
        Book hp2 = new Book("Harry Potter 2", "JK Rowling", "2");
        Book hp3 = new Book("Harry Potter 3", "JK Rowling", "3");
        Book hp4 = new Book("Harry Potter 4", "JK Rowling", "4");
        Book hp5 = new Book("Harry Potter 5", "JK Rowling", "5");
        Book hp6 = new Book("Harry Potter 6", "JK Rowling", "6");
        Book hp7 = new Book("Harry Potter 7", "JK Rowling", "7");

        toBeRead.add(hp1);
        toBeRead.add(hp2);
        toBeRead.add(hp3);
        toBeRead.add(hp4);
        toBeRead.add(hp5);
        toBeRead.add(hp6);
        toBeRead.add(hp7);

        printResult(toBeRead);

        read(hp3, toBeRead,alreadyRead);

//        for (Book book : toBeRead) {
//            if (book.getTitel().equals(titel)) {
//                alreadyRead.add(book);
//                toBeRead.remove(book);
//                break;
//            }
//        }

        printResult(toBeRead);
        printResult(alreadyRead);

    }

    private static void printResult(List<Book> list) {
        for (Book book : list) {
            System.out.println(book);
        }
        System.out.println("There are " + list.size() + " books in the List ");
    }

    public static void read(Book book, List<Book> list, List<Book> alreadyRead) {
        if (list.contains(book)) {
            alreadyRead.add(book);
            list.remove(book);
        }
    }
}
