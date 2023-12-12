package com.workintech.library.books;

import com.workintech.library.Enums.NovelCategory;
import com.workintech.library.authors.Author;

public class NovelBook extends Book {
    private NovelCategory novelCategory;
    public NovelBook(long id, String name, Author author, NovelCategory novelCategory, int page, boolean isBorrowed) {
        super(id, name, author, page,isBorrowed);
        this.novelCategory = novelCategory;
    }

    public NovelCategory getNovelCategory() {
        return novelCategory;
    }
}
