package com.library.management.system;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(int bookId) {
        for (Book b : books) {
            if (b.getId() == bookId) {
                if (b.isAvailable()) {
                    b.setAvailable(false);
                    System.out.println(">>> Success: You have issued " + b.getTitle());
                } else {
                    System.out.println(">>> Error: This book is already checked out.");
                }
                return;
            }
        }
        System.out.println(">>> Error: Book ID " + bookId + " not found.");
    }

    public void returnBook(int bookId) {
        for (Book b : books) {
            if (b.getId() == bookId) {
                if (!b.isAvailable()) {
                    b.setAvailable(true);
                    System.out.println(">>> Success: You have returned " + b.getTitle());
                } else {
                    System.out.println(">>> Error: This book was not issued.");
                }
                return;
            }
        }
        System.out.println(">>> Error: Invalid Book ID.");
    }

    public void showInventory() {
        System.out.println("\n--- Current Library Inventory ---");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}