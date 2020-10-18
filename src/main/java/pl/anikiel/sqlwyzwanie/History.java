package pl.anikiel.sqlwyzwanie;

import java.time.LocalDate;

public class History {
    int id;
    int bookId;
    int readerId;
    LocalDate dateOfBorrowing;
    LocalDate datoOfBorrowing;
    boolean isBorrowed;

    public History(int id, int bookId, int readerId, LocalDate dateOfBorrowing, LocalDate datoOfBorrowing, boolean isBorrowed) {
        this.id = id;
        this.bookId = bookId;
        this.readerId = readerId;
        this.dateOfBorrowing = dateOfBorrowing;
        this.datoOfBorrowing = datoOfBorrowing;
        this.isBorrowed = isBorrowed;
    }
}
