package ru.skypro;

import java.util.Objects;

public class Author {
    String firstName;
    String lastName;

    public Author(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}