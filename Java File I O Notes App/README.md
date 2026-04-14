# 📝 Java Notes App

A simple **console-based Notes Application** built using Java.
This app allows users to **add notes** and **view saved notes** using file handling.

---

## 🚀 Features

* Add a new note
* View all saved notes
* Notes are stored in a file (`MyNotes.txt`)
* Simple and user-friendly console interface

---

## 📂 Project Structure

```
com.javafile.noteapp
│
├── Main.java           // Entry point of the application
└── NotesManager.java  // Handles file operations (add/view notes)
```

---

## 🛠️ Technologies Used

* Java (Core Java)
* File Handling (FileWriter, FileReader, BufferedReader, BufferedWriter)
* Scanner (for user input)

---

## ▶️ How to Run

1. Clone or download the project

2. Open in any IDE (VS Code / IntelliJ / Eclipse)

3. Compile:

```
javac com/javafile/noteapp/*.java
```

4. Run:

```
java com.javafile.noteapp.Main
```

---

## 📌 How It Works

When you run the app, you will see:

```
1. Add a Note
2. View All Notes
3. Exit
```

* Option 1 → Enter and save a note
* Option 2 → Display all saved notes
* Option 3 → Exit the application

---

## 📁 File Storage

* Notes are stored in:

```
MyNotes.txt
```

* If the file does not exist, it will be created automatically.

---

## ⚠️ Error Handling

* Handles invalid input (non-numeric choice)
* Handles file read/write errors
* Shows message if no notes are found

---

## 💡 Future Improvements

* Edit or delete notes
* Search notes
* GUI version (Java Swing / JavaFX)
* Database integration (MySQL)

---

## 👨‍💻 Author

***Md Ashif Ansari***

* Beginner-friendly Java project for learning file handling and user input
