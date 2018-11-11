package edu.tomerbu;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class SQLDemos {

    //requires .jar
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3307/college";

        Properties info = new Properties();
        info.put("user", "root");
        info.put("password", "123456");
        //Remove in production... SSL
        info.put("useSSL", "false");
        info.put("allowPublicKeyRetrieval", "true");
        info.put("serverTimezone", "UTC");

        return DriverManager.getConnection(url, info);
    }


    //DML = DATA Manipulation - changes to the database: CREATE TABLE, INSERT UPDATE, ETC.
    public static void insert() throws SQLException{
        Connection con = getConnection();

        Statement statement = con.createStatement();

        statement.execute("INSERT INTO students(firstName, lastName, email, phone)" +
                              "VALUES('Moe', 'Green', 'Moe@gmail.com', '05050505050')");

    }
    //Query
    public static void select() throws SQLException{

        ArrayList<Student> all = new ArrayList<>();
       //con
        Connection con = getConnection();
        //createStatement
        Statement stmt = con.createStatement();
        //rs = stmt.executeQuery("SELECT * FROM Students")
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");

        if (!rs.first())return;

        //iterate the result set, row by row
        do{
            int id = rs.getInt(1); //IN SQL WE Start Counting from 1
            String firstName = rs.getString(2);
            String lastName = rs.getString(3);
            String email = rs.getString(4);
            String phone = rs.getString(5);

            //all.add(new Student()...)
            System.out.println(firstName);
        }while (rs.next());


        //return  all;
    }



}
