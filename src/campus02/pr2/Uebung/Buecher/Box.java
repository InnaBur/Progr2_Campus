package campus02.pr2.Uebung.Buecher;

public class Box {

    Book [] bookBoxContents;
    Fossilien [] fossiliensBoxContents;


    public Box() {
        this.bookBoxContents = new  Book[10];
        this.fossiliensBoxContents = new  Fossilien[10];
    }

    public void putBook (Book book) {
        for (int i = 0; i < this.bookBoxContents.length; i++) {
            if (this.bookBoxContents[i] == null) {
                this.bookBoxContents[i] = book;
                break;
            } else {
                System.out.println("Box full, please create new one");
            }
        }
    }

    public void putFoss (Fossilien fossilien) {
        for (int i = 0; i < this.fossiliensBoxContents.length; i++) {
            if (this.fossiliensBoxContents[i] == null) {
                this.fossiliensBoxContents[i] = fossilien;
                break;
            }
            if (i == this.fossiliensBoxContents.length - 1){
                System.out.println("Box full, please create new one");
            }
        }
    }

    public void printContents () {
        for (Book book: this.bookBoxContents) {
            System.out.println(book);
        }
    }

    public void printContentsFos () {
        for (Fossilien fossilien: this.fossiliensBoxContents) {
            System.out.println(fossilien);
        }
    }
}
