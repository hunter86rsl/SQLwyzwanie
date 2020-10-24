package pl.anikiel.sqlwyzwanie.repository;

import java.sql.*;
import java.util.Properties;

public class PSQLConnection {

    public static Connection getConnecton() throws SQLException {
        String url = "jdbc:postgresql://ec2-54-228-250-82.eu-west-1.compute.amazonaws.com/d1ocao8gribcc7?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
        Properties props = new Properties();
        props.setProperty("user", "lzkdykqedceymd");
        props.setProperty("password", "ffd7738e52ac7763dcd23f3703ece771385557798585136e088012aa0019adb1");
        props.setProperty("ssl", "false");

        return DriverManager.getConnection(url, props);
    }


}
