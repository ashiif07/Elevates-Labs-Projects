package com.javafile.noteapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("\n=*=*=*=*= Java Notes App =*=*=*=*=");

        do {
            System.out.println("\n1. Add a Note");
            System.out.println("2. View All Notes");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                scanner.next();
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter your note: ");
                    String note = scanner.nextLine();
                    NotesManager.addNote(note);
                    break;
                case 2:
                    NotesManager.viewNotes();
                    break;
                case 3:
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 3);

        scanner.close();
    }
}