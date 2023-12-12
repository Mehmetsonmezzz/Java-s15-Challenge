package com.workintech.library.library;

import com.workintech.library.books.Book;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private int userId;
    private String userName;
    private List<Book> borrowedBooks;

    public Users(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (borrowedBooks.size() < 5 && !book.isBorrowed()) {
            borrowedBooks.add(book);
            book.borrowBook();
            System.out.println("Kitap ödünç alındı: " + book.getName());
        } else {
            System.out.println("Kitap ödünç alınamadı. Limit aşıldı veya kitap zaten alınmış.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnBook();
            System.out.println("Kitap geri teslim edildi: " + book.getName());
        } else {
            System.out.println("Bizden böyle bir kitap almadınız.");
        }
    }
}