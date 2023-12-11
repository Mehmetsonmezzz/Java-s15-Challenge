package com.workintech.library.library;

import com.workintech.library.authors.Author;
import com.workintech.library.books.Book;

import java.util.Map;
import java.util.TreeMap;

public class Library {
    private Map<Long,Book> books;
    private Map<Long, Author> authors;

    public Library() {
        this.books = new TreeMap<>();
        this.authors = new TreeMap<>();
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", authors=" + authors +
                '}';
    }
}
