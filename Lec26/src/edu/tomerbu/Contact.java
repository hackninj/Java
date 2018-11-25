package edu.tomerbu;

import java.util.Objects;

public class Contact extends Object implements Comparable<Contact>{
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    //ctor, getters, toString

    public Contact(String id, String firstName, String lastName, String email, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(id, contact.id) &&
                Objects.equals(firstName, contact.firstName) &&
                Objects.equals(lastName, contact.lastName) &&
                Objects.equals(email, contact.email) &&
                Objects.equals(phone, contact.phone);
    }

    //cache
    private int hash = -1;
    @Override
    public int hashCode() {
        //return Objects.hash(id, firstName, lastName, email, phone);
        if (hash == -1){
            hash =  Objects.hash(id, firstName, lastName, email, phone);
        }
        return hash;
    }


    //int hash = 0
//    0 - same value
    @Override
    public int compareTo(Contact o) {

        int comp = this.lastName.compareTo(o.lastName);
        if (comp != 0)return comp;

        comp = this.firstName.compareTo(o.firstName);
        if (comp != 0)return comp;

        comp = this.email.compareTo(o.email);
        if (comp != 0)return comp;

        comp = this.id.compareTo(o.id);
        if (comp != 0)return comp;

        comp = this.phone.compareTo(o.phone);
        if (comp != 0)return comp;

        return comp;
    }

    //2 Contacts are the same if they share the same ID.
  //  @Override
//    public boolean equals(Object other) {
//        if (super.equals(other)) return true; //return true if same ref.
//
//        if (!(other instanceof Contact)) return false;
//        //cast is safe!
//        Contact c2 = (Contact) other;
//
//
//            return this.id.equals(c2.id)
//                && this.email.equals(c2.email)
//                && this.phone.equals(c2.phone)
//                && this.firstName.equals(c2.firstName)
//                && this.lastName.equals(c2.lastName);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return 31^0*id.hashCode() + 31^1*email.hashCode() + 31^2 *firstName.hashCode();
//    }
}

//
//public class Person {
//    private String id;
//    private String firstName;
//    private String lastName;
//
//}
