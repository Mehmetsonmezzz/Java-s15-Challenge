package com.workintech.library.books;

import com.workintech.library.authors.Author;

public class MagazinesBook extends Book{
    public MagazinesBook(long id, String name, Author author, int page, boolean isPublic) {
        super(id, name, author, page, isPublic);
    }
}
