package pl.anikiel.sqlwyzwanie;

import pl.anikiel.sqlwyzwanie.repository.BookRepository;
import pl.anikiel.sqlwyzwanie.repository.HistoryRepository;
import pl.anikiel.sqlwyzwanie.repository.ReaderRepository;

public class Main {

    public static void main(String[] args) {

        BookRepository bookRepo = new BookRepository();
        ReaderRepository readerRepo = new ReaderRepository();
        HistoryRepository historyRepo = new HistoryRepository();

        bookRepo.initBooks();
        readerRepo.initReaders();
        historyRepo.initHistory();
    }


}
