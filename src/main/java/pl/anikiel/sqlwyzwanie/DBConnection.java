package pl.anikiel.sqlwyzwanie;

import java.sql.*;
import java.util.Properties;

public class DBConnection {

    public DBConnection() {
        String url = "jdbc:postgresql://localhost:5432/sqlwyzwanie";
        Properties props = new Properties();
        props.setProperty("user", "adrian");
        props.setProperty("password", "passw0rd");
        props.setProperty("ssl", "true");

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, props);

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("select * from books");


            while (result.next()) {
                System.out.println(result.getString("author"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
