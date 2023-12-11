package com.workintech.library.interfaces;

import com.workintech.library.books.Book;

public interface LibrarianDuties {


    boolean searchBook(String name);
    void addBook(Book book);
    void removeBook(long Id);
}
