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

    public Map<Long, Book> getBooks() {
        return books;
    }

    public void setBooks(Map<Long, Book> books) {
        this.books = books;
    }

    public Map<Long, Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Map<Long, Author> authors) {
        this.authors = authors;
    }
    public void addBook(Book book) {
        if(books.containsKey(book.getId())) {
            System.out.println("This book is already on the list");
        }else {
            books.put(book.getId(),book);
        }

    }
    public void addAuthor(Author author){
        if (authors.containsKey(author.getId())){
            System.out.println("Author is already on the list");

        }else {
            authors.put(author.getId(),author);
        }

    }
    public void removeBook(Book book) {
        if (books.containsKey(book.getId())) {
            books.remove(book.getId());
            System.out.println("Book removed from the library: " + book.getName());
        } else {
            System.out.println("Book not found in the library: " + book.getName());
        }
    }
}
