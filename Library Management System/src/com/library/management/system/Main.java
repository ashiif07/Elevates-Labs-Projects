package com.library.management.system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        
        library.addBook(new Book(101, "Java Basics", "James Gosling"));
        library.addBook(new Book(102, "OOP Design", "Robert Martin"));
        library.addBook(new Book(103, "Data Structures", "Ellis Horowitz"));

        System.out.println("=== Welcome to the Library Management System ===");

        boolean running = true;
        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. View All Books");
            System.out.println("2. Issue a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.showInventory();
                    break;

                case 2:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = scanner.nextInt();
                    library.issueBook(issueId);
                    break;

                case 3:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = scanner.nextInt();
                    library.returnBook(returnId);
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        scanner.close();
    }
}
