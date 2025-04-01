package campus02.pr2.Uebung.Buecher;

public class Book {

    private String titel;
    private String autor;
    private String isbn;

    public Book(String titel, String autor, String isbn) {
        this.titel = titel;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitel() {
        return titel;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titel='" + titel + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
