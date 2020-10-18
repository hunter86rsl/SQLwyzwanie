package pl.anikiel.sqlwyzwanie;

import pl.anikiel.sqlwyzwanie.model.Book;
import pl.anikiel.sqlwyzwanie.model.History;
import pl.anikiel.sqlwyzwanie.model.Reader;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Book> books = new ArrayList<>();
    private static List<Reader> readers = new ArrayList<>();
    private static List<History> histories = new ArrayList<>();

    public static void main(String[] args) {
        initBooks();
        initReaders();
        initHistory();
    }

    private static void initBooks() {

        String sql = "SELECT * FROM books";

        try (Connection conn = PSQLConnection.getConnecton();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql);
        ) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                int yearOfPublishing = rs.getInt("year_of_publishing");

                Book book = new Book(id, title, author, yearOfPublishing);
                books.add(book);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void initReaders() {
        String sql = "SELECT * FROM readers";

        try (Connection conn = PSQLConnection.getConnecton();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql);
        ) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");

                Reader reader = new Reader(id, name, surname, email);
                readers.add(reader);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void initHistory() {
        String sql = "SELECT * FROM history";

        try (Connection conn = PSQLConnection.getConnecton();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql);
        ) {

            while (rs.next()) {
                int id = rs.getInt("id");
                int bookId = rs.getInt("book_id");
                int readerID = rs.getInt("reader_id");
                LocalDate dateOfBorrowing = rs.getDate("date_of_borrowing").toLocalDate();
                LocalDate datoOfReturning = rs.getDate("date_of_returning").toLocalDate();
                boolean isBorrowed = rs.getBoolean("is_borrowed");

                History history = new History(id, bookId, readerID, dateOfBorrowing, datoOfReturning, isBorrowed);
                histories.add(history);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
