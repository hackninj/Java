package edu.tomerbu;

import java.sql.SQLException;
import java.util.ArrayList;


public interface IStudentsDao {
    void add(Student s) throws SQLException;

    ArrayList<Student> getStudents() throws SQLException;

    void delete(Student s) throws SQLException;

    void update(Student s) throws SQLException;

}
