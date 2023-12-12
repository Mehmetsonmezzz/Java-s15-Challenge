package com.workintech.library.library;

import com.workintech.library.Enums.NovelCategory;
import com.workintech.library.books.Book;
import com.workintech.library.books.NovelBook;
import com.workintech.library.interfaces.LibrarianDuties;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Librarian implements LibrarianDuties {
    private final String name;
    private final List<Book> books;
    private Library library;

    public Librarian(String name, List<Book> books, Library library) {
        this.name = name;
        this.books = books;
        this.library=library;
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
        if(books.contains(book.getId())) {
            System.out.println("This book is already on the list");
        }else {
            books.add(book);
            library.addBook(book);
        }
    }



    //@Override
    public void removeBook(long Id) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getId()==(Id)) {
                iterator.remove();
                library.removeBook(book);//aynı zamanda libraryden de sil
                System.out.println("Book removed: " + book.getName());
                return;
            }
        }
        System.out.println("Book not found: " + Id);
    }


    public void listBooksByCategory(NovelCategory category) {
        for (Book book : books) {
            if (book instanceof NovelBook) {
                NovelBook novelBook = (NovelBook) book;
                if (novelBook.getNovelCategory() == category) {
                    System.out.println("- " + novelBook.getName());
                }
            }
        }
    }

}
