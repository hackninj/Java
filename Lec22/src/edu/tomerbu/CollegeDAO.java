package edu.tomerbu;

//Database Access Object
//SQL -> To and from Java Objects.

//ALL Sql code

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

//requires .jar
public class CollegeDAO implements IStudentsDao{

    private static IStudentsDao sharedInstance;
    public static IStudentsDao getInstance(){
        if (sharedInstance == null){
            sharedInstance = new CollegeDAO();
        }
        return sharedInstance;
    }
    private CollegeDAO(){/*No Instances, Please.*/}

    private Connection getConnection() throws SQLException {
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

    @Override
    public ArrayList<Student> getStudents() throws SQLException {
        ArrayList<Student> students = new ArrayList<>();

        Connection con = getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");

        if (rs.first()) {
            do {
                students.add(new Student(
                                rs.getInt(1),
                                rs.getString(2),
                                rs.getString(3),
                                rs.getString(4),
                                rs.getString(5)
                            )
                );
            } while (rs.next());
        }
        return students;
    }

    @Override
    public void delete(Student s) throws SQLException {

    }

    @Override
    public void update(Student s) throws SQLException {

    }
    @Override
    public void add(Student s) throws SQLException {
        Connection con = getConnection();
        Statement stmt = con.createStatement();

        String sql = String.format(
                "INSERT INTO students(firstName, lastName, phone, email)" +
                        " VALUES('%s', '%s', '%s', '%s')",
                s.getFirstName(), s.getLastName(), s.getPhone(), s.getEmail()
                );


        System.out.println(sql);
        stmt.execute(sql);


    }






    //delete(student)
    //update(student)
    //private createTables

}



