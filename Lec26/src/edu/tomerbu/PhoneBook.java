package edu.tomerbu;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    //encapsulate:
    private List<Contact> contacts = new ArrayList<>();

    public PhoneBook() {
       contacts.add(new Contact("123", "Moshe", "Doe", "Moshe@gmai.com", "0501640"));
       contacts.add(new Contact("040050505", "Moshe", "Baron", "Moshe@gmail.com", "05464806408"));
       contacts.add(new Contact("040050505", "Moshe", "Cohen", "Moshe@gmail.com", "05464806408"));
       contacts.add(new Contact("040050505", "Moshe", "Cool", "Moshe@gmail.com", "05464806408"));
       contacts.add(new Contact("040050505", "Dave", "Green", "Moshe@gmail.com", "05464806408"));
       contacts.add(new Contact("040050505", "Momo", "Doe", "Moshe@gmail.com", "05464806408"));
       contacts.add(new Contact("040050505", "Alon", "Doe", "Moshe@gmail.com", "05464806408"));
       contacts.add(new Contact("040050505", "Zeev", "Doe", "Moshe@gmail.com", "05464806408"));
    }

    public void add(Contact c){
        contacts.add(c);
    }

    //aim: Read only
    public List<Contact> getContacts() {
        ArrayList<Contact> copy = new ArrayList<>();
        //fill with clones
        return copy;
    }
}
