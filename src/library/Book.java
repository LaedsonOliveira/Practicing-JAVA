package library;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publicationDate;
    private int shelf;
    private boolean avaible;

    public Book(String title, String author, String publicationDate, int shelf, boolean avaible) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.shelf = shelf;
        this.avaible = avaible;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public int getShelf() {
        return shelf;
    }

    public boolean isAvaible() {
        return avaible;
    }
}

