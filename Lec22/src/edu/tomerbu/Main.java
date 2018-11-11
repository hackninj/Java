package edu.tomerbu;

import java.sql.SQLException;


public class Main {

    public static void main(String[] args) {

        try {
        IStudentsDao dao = CollegeDAO.getInstance();
            dao.add(
                    new Student("a", "b", "050", "a@gmail.com")
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void format() {
        int age = 10;
        String name = "Moshe";

        //Moshe is age years old
        String str = String.format("%s is %d years old", name, age);

        System.out.println(str);
    }
}
