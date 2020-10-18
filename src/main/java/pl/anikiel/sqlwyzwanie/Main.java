package pl.anikiel.sqlwyzwanie;

import pl.anikiel.sqlwyzwanie.model.Reader;
import pl.anikiel.sqlwyzwanie.repository.BookRepository;
import pl.anikiel.sqlwyzwanie.repository.HistoryRepository;
import pl.anikiel.sqlwyzwanie.repository.ReaderRepository;

public class Main {

    private static BookRepository bookRepo = new BookRepository();
    private static ReaderRepository readerRepo = new ReaderRepository();
    private static HistoryRepository historyRepo = new HistoryRepository();

    public static void main(String[] args) {
        bookRepo.initBooks();
        readerRepo.initReaders();
        historyRepo.initHistory();
    }


}
