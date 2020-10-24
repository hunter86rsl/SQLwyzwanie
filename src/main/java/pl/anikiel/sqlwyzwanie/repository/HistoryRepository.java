package pl.anikiel.sqlwyzwanie.repository;

import pl.anikiel.sqlwyzwanie.model.History;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HistoryRepository {
    private List<History> histories = new ArrayList<>();

    public void initHistory() {
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
