package pl.anikiel.sqlwyzwanie.repository;

import pl.anikiel.sqlwyzwanie.model.Reader;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReaderRepository {

    private static List<Reader> readers = new ArrayList<>();

    public static void initReaders() {
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
}
