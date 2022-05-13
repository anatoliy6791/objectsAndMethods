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

    public String toString() {
        return "Название книги: " + this.nameOfBook + " Год издания: " + this.dateOfBook + this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return dateOfBook == book.dateOfBook && nameOfBook.equals(book.nameOfBook) && author.firstName.equals(book.author.firstName) && author.lastName.equals(author.lastName);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nameOfBook, author.firstName,author.lastName, dateOfBook);
    }
}
