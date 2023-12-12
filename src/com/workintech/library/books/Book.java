package com.workintech.library.books;

import com.workintech.library.authors.Author;

import java.util.Objects;

public abstract class Book {
    private long id;
    private String name;
    private Author author;

    private int page;
    private boolean isBorrowed;

    public Book(long id, String name, Author author,  int page, boolean isBorrowed) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.page = page;
        this.isBorrowed=isBorrowed;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        this.isBorrowed = true;
    }

    public void returnBook() {
        this.isBorrowed = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }



    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name=" + name +
              //  ", author=" + author +
                ", page=" + page +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
