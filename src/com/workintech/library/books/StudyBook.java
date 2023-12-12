package com.workintech.library.books;

import com.workintech.library.authors.Author;

public class StudyBook extends Book{
    public StudyBook(long id, String name, Author author, int page, boolean isBorrowed) {
        super(id, name, author, page, isBorrowed);
    }
}
