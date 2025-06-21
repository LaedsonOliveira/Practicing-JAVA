package library;

public class Shelf {

    private int id;
    private String category;
    private int numberOfBooks;

    public Shelf(String category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }
}
