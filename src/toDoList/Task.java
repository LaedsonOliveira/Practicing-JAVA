package toDoList;

import java.time.LocalDate;
import java.util.Date;

public class Task {
    private int id;
    private String title;
    private String description;
    private LocalDate deliveryDate;
    private boolean importance;
    private boolean active;


    public Task(String title, String description, LocalDate deliveryDate, boolean importance) {
        this.title = title;
        this.description = description;
        this.deliveryDate = deliveryDate;
        this.importance = importance;
        active = true;
        id++;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public boolean getImportance() {
        return importance;
    }

    public boolean isActive() {
        return active;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
