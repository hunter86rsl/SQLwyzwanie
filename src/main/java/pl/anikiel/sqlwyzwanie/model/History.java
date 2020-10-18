package pl.anikiel.sqlwyzwanie.model;

import java.time.LocalDate;

public class History {
    int id;
    int bookId;
    int readerId;
    LocalDate dateOfBorrowing;
    LocalDate dateOfReturning;
    boolean isBorrowed;

    public History(int id, int bookId, int readerId, LocalDate dateOfBorrowing, LocalDate dateOfReturning, boolean isBorrowed) {
        this.id = id;
        this.bookId = bookId;
        this.readerId = readerId;
        this.dateOfBorrowing = dateOfBorrowing;
        this.dateOfReturning = dateOfReturning;
        this.isBorrowed = isBorrowed;
    }
}
