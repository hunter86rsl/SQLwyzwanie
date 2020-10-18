package pl.anikiel.sqlwyzwanie.repository;

import pl.anikiel.sqlwyzwanie.model.Book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private static List<Book> books = new ArrayList<>();

    public static void initBooks() {

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

}
