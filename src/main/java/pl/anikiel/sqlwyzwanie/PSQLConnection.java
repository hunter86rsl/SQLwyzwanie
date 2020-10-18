package pl.anikiel.sqlwyzwanie;

import java.sql.*;
import java.util.Properties;

public class PSQLConnection {

    public PSQLConnection() {

    }


    public Connection getConnecton() throws SQLException {
        String url = "jdbc:postgresql://127.0.0.1:5432/sqlwyzwanie";
        Properties props = new Properties();
        props.setProperty("user", "adrian");
        props.setProperty("password", "passw0rd");
        props.setProperty("ssl", "true");

        return DriverManager.getConnection(url, props);
    }


}
