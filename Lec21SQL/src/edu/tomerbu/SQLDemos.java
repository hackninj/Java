package edu.tomerbu;

import java.sql.*;
import java.util.Properties;

public class SQLDemos {

    public static void query() {
        try {
            Connection con = getConnection();
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM actor");
            rs.first();
            do {
                String s = rs.getString(1);
                String s2 = rs.getString(2);
                System.out.println(s2);
            } while (rs.next());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        String dbName = "sakila";
        String dbURL = "jdbc:mysql://localhost:3307/" + dbName;

        Properties props = new Properties();
        props.put("useSSL", "false");
        props.put("user", "root");
        props.put("password", "123456");
        props.put("allowPublicKeyRetrieval", "true");
        props.put("serverTimezone", "UTC");

        Connection connection = DriverManager.getConnection(dbURL, props);

        return connection;
    }
}
