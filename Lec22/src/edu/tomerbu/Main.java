package edu.tomerbu;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //instance
        CollegeDAO dao = new CollegeDAO();

        try {
            ArrayList<Student> students = dao.getStudents();
            System.out.println(students);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
