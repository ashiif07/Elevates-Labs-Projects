# 🧮 Java Console Calculator

A simple **console-based calculator** built using Java. It performs basic arithmetic operations like addition, subtraction, multiplication, and division.

---

## 📌 Features

- ➕ Addition  
- ➖ Subtraction  
- ✖️ Multiplication  
- ➗ Division (with division-by-zero handling)  
- 🔁 Runs continuously until user exits  
- ❌ Handles invalid menu choices  

---

## 🛠️ Technologies Used

- Java  
- `java.util.Scanner` for input  

---

## 🚀 How to Run

### 1️⃣ Compile the Program
```bash
javac Calculator.java
```

### 2️⃣ Run the Program
```bash
java Calculator
```

---

## 📷 Sample Output

```
----- Java Console Calculator -----

Enter 1 for Addition
Enter 2 for Subtraction
Enter 3 for Multiplication
Enter 4 for Division
Enter 5 for Exit

Enter your Choice: 1
Enter First Number: 10
Enter Second Number: 5

Result: 15.0
```

---

## ⚠️ Error Handling

- Invalid choice → Shows error message  
- Division by zero →  
  ```
  Error: Division by zero is not allowed.
  ```

---

## 📂 Project Structure

```
Calculator.java
README.md
```

---

## 📚 Methods Used

| Method | Description |
|--------|------------|
| `add()` | Returns sum |
| `sub()` | Returns difference |
| `mul()` | Returns product |
| `div()` | Handles division & zero check |

---

## 💡 Future Improvements

- Add GUI (Swing / JavaFX)  
- Add advanced operations (power, square root)  
- Add input validation (non-numeric input)  

---

## 👨‍💻 Author

**Md Ashif Ansari**  
Java Beginner 🚀