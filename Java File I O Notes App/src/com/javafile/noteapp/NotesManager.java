package com.javafile.noteapp;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;


public class NotesManager {

    private static final String FILE_NAME = "MyNotes.txt";

    public static void addNote(String note) {

        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fw)) {
            bufferedWriter.write(note);
            bufferedWriter.newLine();
            System.out.println("Note saved successfully.");

        } catch (IOException e) {

            System.err.println("Error: Could not write to file.");
            e.printStackTrace();
        }
    }


    public static void viewNotes() {

        File file = new File(FILE_NAME);

        if (!file.exists() || file.length() == 0) {

            System.out.println("No notes found.");
            return;
        }

        System.out.println("\n--- Your Saved Notes ---");
        try (FileReader fr = new FileReader(FILE_NAME);
             BufferedReader bufferedReader = new BufferedReader(fr)) {

            String line;
            int count = 1;

            while ((line = bufferedReader.readLine()) != null) {

                System.out.println(count + ". " + line);
                count++;
            }
        } catch (IOException e) {

            System.err.println("Error: Could not read the file.");
            e.printStackTrace();
        }
    }
}