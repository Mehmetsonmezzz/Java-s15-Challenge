package com.workintech.library.library;

import com.workintech.library.books.Book;
import com.workintech.library.interfaces.LibrarianDuties;

import java.util.Iterator;
import java.util.List;

public class Librarian implements LibrarianDuties {
    private final String name;
    private final List<Book> books;

    public Librarian(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }


    @Override
    public boolean searchBook(String name) {
            for (Book book : books) {
                if (book.getName().equals(name)) {
                    return true;
                }
            }
            return false;
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    //@Override
    public void removeBook(long Id) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getId()==(Id)) {
                iterator.remove();
                System.out.println("Book removed: " + book.getName());
                return;
            }
        }
        System.out.println("Book not found: " + Id);
    }

}
