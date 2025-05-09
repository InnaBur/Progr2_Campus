package campus02.pr2.Uebung.Generics;

public class GenericBox<T> {
    private T[] contents;

    public GenericBox() {
        this.contents = (T[]) new Object[10];
    }

    public void putItem(T item) {
        for (int i = 0; i < contents.length; i++) {
            if (contents[i] == null) {
                contents[i] = item;
                break;
            }
        }
    }

    public void printContents () {
        for (T item: contents) {
            System.out.println(item);
        }
    }
}
