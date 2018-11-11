package edu.tomerbu;


public class Student {
    //id is optional
    private Integer id; //Integer vs int (allows nulls)
    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    //SELECT (id is known)
    //ctor(full)
    public Student(Integer id, String firstName, String lastName, String phone, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    //new Student()..
    //ctor (no id yet, id is only available after submit)
    public Student(String firstName, String lastName, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    //empty() ... IO for Scanner //console

    public Student() {
        this.firstName = IO.nextLine("Enter First Name: ");
        this.lastName = IO.nextLine("Enter Last Name: ");
        this.phone = IO.nextLine("Enter Phone: ");
        this.email = IO.nextLine("Enter Email address: ");
    }


    //getters setters

    public Integer getId() {
        return id;
    }
//    public void setId(Integer id) {
//        this.id = id;
//    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    //toString
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
