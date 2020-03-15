package edu.escuelaing.ieti.models;

public class Task{
    private String Id;
    private String state;
    private String description;
    private String dueDate;
    private String author;

    public Task(String Id, String state, String description, String dueDate, String author) {
        this.Id = Id;
        this.state = state;
        this.description = description;
        this.dueDate = dueDate;
        this.author = author;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}