package campus02.pr2.Uebung.Icebreaker;

public class Favourite {

    Medium medium;
    String title;
    String comment;

    public Favourite(Medium medium, String title, String comment) {
        this.medium = medium;
        this.title = title;
        this.comment = comment;
    }

    public Favourite(Medium medium, String title) {
        this.medium = medium;
        this.title = title;
    }

    public Medium getMedium() {
        return medium;
    }

    public String getTitle() {
        return title;
    }

    public String getComment() {
        return comment;
    }
}
