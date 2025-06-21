package library;

import java.time.LocalDate;

public class Loan {
    private int id;
    private Book book;
    private LocalDate checkOutDate;
    private LocalDate dueDate;

    public Loan(Book book, LocalDate checkOutDate, LocalDate dueDate) {
        this.book = book;
        this.checkOutDate = checkOutDate;
        this.dueDate = dueDate;
    }

    public int getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
}


