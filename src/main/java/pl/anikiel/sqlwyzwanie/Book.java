package pl.anikiel.sqlwyzwanie;

public class Book {
    int id;
    String title;
    String author;
    int yearOfPublishing;

    public Book(int id, String title, String author, int yearOfPublishing) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }
}
