package edu.tomerbu;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        ArrayList l = new ArrayList();
        Object o = l.get(0);
        boolean b = o.getClass() == Integer.class;





        
        PhoneBook pb = new PhoneBook();
        List<Contact> contacts = pb.getContacts();

        contacts.clear();
        contacts.add(new Contact("!♥", "Youve been Hacked", "" ,"", ""));

        System.out.println(contacts);

//
//        Todo t = new Todo("abc", "ddd");
//        System.out.println(t);
//
//        try {
//            Todo copy = (Todo) t.clone();
//            System.out.println(copy);
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        try {
//            Todo todoClone = (Todo) t.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//
//
//        List<Book> books = new ArrayList<>();
//        books.add(new Book("123", "Harry 5"));
//        books.add(new Book("123", "Harry 2"));
//        books.add(new Book("123", "Harry 4"));
//        books.add(new Book("123", "Harry 3"));
//        books.add(new Book("123", "Harry 1"));
//
//
//        Collections.sort(books);
//
//        System.out.println(books);

//        // System.out.println("Moshe".compareTo("Dave"));
//        List<Contact> phoneBook = new ArrayList<>();
//
//        phoneBook.add(new Contact("040050505", "Josh", "Doe", "Moshe@gmail.com", "05464806408"));
//        phoneBook.add(new Contact("040050505", "Moshe", "Baron", "Moshe@gmail.com", "05464806408"));
//        phoneBook.add(new Contact("040050505", "Moshe", "Cohen", "Moshe@gmail.com", "05464806408"));
//        phoneBook.add(new Contact("040050505", "Moshe", "Cool", "Moshe@gmail.com", "05464806408"));
//        phoneBook.add(new Contact("040050505", "Dave", "Green", "Moshe@gmail.com", "05464806408"));
//        phoneBook.add(new Contact("040050505", "Momo", "Doe", "Moshe@gmail.com", "05464806408"));
//        phoneBook.add(new Contact("040050505", "Alon", "Doe", "Moshe@gmail.com", "05464806408"));
//        phoneBook.add(new Contact("040050505", "Zeev", "Doe", "Moshe@gmail.com", "05464806408"));
//
//        Collections.sort(phoneBook);
//
//        System.out.println(phoneBook);


    }
}
