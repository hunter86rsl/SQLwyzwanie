package pl.anikiel;

import java.sql.*;
import java.util.Properties;

public class DBConnection {
    Connection connection;

    public DBConnection() {
        initConnection();
    }

    private void initConnection() {
        String url = "jdbc:postgresql://localhost:5432/sqlwyzwanie";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "p@ssw0rd");
        props.setProperty("ssl", "true");

        try {
            connection = DriverManager.getConnection(url, props);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
