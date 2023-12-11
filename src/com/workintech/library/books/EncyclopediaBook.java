package com.workintech.library.books;

import com.workintech.library.Enums.NovelCategory;
import com.workintech.library.authors.Author;

public class EncyclopediaBook extends Book {
    public EncyclopediaBook(long id, String name, Author author, int page, boolean isPublic) {
        super(id, name, author, page, isPublic);
    }
}
