package com.workintech.library.authors;

import com.workintech.library.books.Book;;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Author {
    private long id;
    private String name;
    private List<Book> books;

    public Author(long id, String name, List<Book> books) {
        this.id = id;
        this.books = books;
        this.name=name;
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
    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", books=" + books +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id == author.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    public void addBook(Book book) {
        if (books == null) {
            books = new LinkedList<>();
        }
        books.add(book);
    }

}
