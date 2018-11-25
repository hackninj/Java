package edu.tomerbu;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String ISBN;
    private String title;

    public Book(String ISBN, String title) {
        this.ISBN = ISBN;
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    //alt insert (hash, equals, implement Comparable<Book>)

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(ISBN, book.ISBN) &&
                Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, title);
    }

    @Override
    public int compareTo(Book o) {
        int comp = ISBN.compareTo(o.getISBN());
        if (comp != 0) return comp;

        comp = title.compareTo(o.getTitle());
        if (comp != 0) return comp;

        return comp;
    }
}
