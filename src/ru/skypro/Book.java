package ru.skypro;

import java.util.Objects;

public class Book {
    String nameOfBook;
    Author author;
    int dateOfBook;

    public Book(String nameOfBook, int dateOfBook, Author author) {
        this.nameOfBook = nameOfBook;
        this.dateOfBook = dateOfBook;
        this.author = author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getDateOfBook() {
        return dateOfBook;
    }


    public void setDateOfBook(int dateOfBook) {
        this.dateOfBook = dateOfBook;
    }
}
