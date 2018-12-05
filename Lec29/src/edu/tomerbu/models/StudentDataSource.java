package edu.tomerbu.models;

import java.util.ArrayList;
import java.util.List;

//Memory
public class StudentDataSource {
    public static List<Student> students = new ArrayList<>();

    public static void update(Student s){
        //get the id from the student parameter:
        Integer index = s.getId();

        //get the student by id:
        Student student = students.get(index);

        //update the values:
        student.setFirstName(s.getFirstName());
        student.setFirstName(s.getLastName());
    }



    public static void addStudent(Student s){
        s.setId(students.size());
        students.add(s);
    }
    public static Student getStudent(String id){

        int i = Integer.valueOf(id);
        try{
            return students.get(i);
        }catch (Exception e){
            return null;
        }
    }
    public static List<Student> getStudents(){
        return students;
    }
}
