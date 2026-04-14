# 📚 Library Management System

A simple **console-based Library Management System** built using Java.
This project allows users to **view books, issue books, and return books** using basic Object-Oriented Programming concepts.

---

## 🚀 Features

* View all available books
* Issue a book
* Return a book
* Pre-loaded sample books
* Simple and easy console interface

---

## 📂 Project Structure

```
com.library.management.system
│
├── Main.java     // Entry point of the application
├── Library.java  // Handles book operations (issue, return, display)
└── Book.java     // Book model class
```

---

## 🛠️ Technologies Used

* Java (Core Java)
* OOP Concepts (Class, Object, Encapsulation)
* ArrayList (for storing books)
* Scanner (for user input)

---

## ▶️ How to Run

1. Clone or download the project

2. Open in any IDE (VS Code / IntelliJ / Eclipse)

3. Compile:

```
javac com/library/management/system/*.java
```

4. Run:

```
java com.library.management.system.Main
```

---

## 📌 How It Works

When you run the program, you will see:

```
1. View All Books
2. Issue a Book
3. Return a Book
4. Exit
```

* Option 1 → Displays all books with their status
* Option 2 → Enter Book ID to issue a book
* Option 3 → Enter Book ID to return a book
* Option 4 → Exit the system

---

## 📚 Sample Books

The system starts with pre-added books:

* Java Basics — James Gosling
* OOP Design — Robert Martin
* Data Structures — Ellis Horowitz

---

## ⚙️ Functionality Details

* Each book has:

  * ID
  * Title
  * Author
  * Availability status

* Book status:

  * `[Available]` → Can be issued
  * `[Issued]` → Already taken

---

## ⚠️ Error Handling

* Invalid menu choice handling
* Book ID not found message
* Prevent issuing already issued book
* Prevent returning already available book

---

## 💡 Future Improvements

* Add new books dynamically
* Remove books
* Search books by name
* Add user login system
* Store data in file or database

---

## 👨‍💻 Author

* Beginner-friendly Java project to practice OOP and logic building
