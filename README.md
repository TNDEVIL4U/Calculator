
# 🧮 Java Calculator (Swing + AWT)

A simple calculator application built in Java using **Swing** and **AWT** for the graphical user interface. This calculator mimics the functionality of a basic physical calculator and supports standard arithmetic operations.

---

## 📸 Screenshot

<img width="218" height="361" alt="Screenshot 2025-07-23 210326" src="https://github.com/user-attachments/assets/023a165a-68bf-4c8e-8487-df833cc3587e" />


## 🚀 Features

* Addition, Subtraction, Multiplication, Division
* Square root calculation
* Percentage operation
* Positive/Negative toggle (`+/-`)
* Clear button (`AC`)
* Decimal support

---

## 🛠️ Tech Stack

* Java 8 or higher
* Swing
* AWT

---


## 🧠 How It Works

* The calculator GUI is built with `JFrame`, `JPanel`, `JButton`, and `JLabel`.
* All button events are handled using `ActionListener`.
* Input is taken via number and operator buttons.
* Upon pressing `=`, the selected operation is performed using the stored operands and operator.
* The result is displayed with formatting (e.g., whole numbers shown without `.0`).

---

## ▶️ How to Run

1. Clone the repository or download the code.
2. Navigate to the project folder.
3. Compile the Java file:

```
javac Calculator.java
```

4. Run the program:

```
java Calculator
```

---

## 📌 Example Usage

* Enter `12`, press `+`, then `8`, then `=`, and you’ll get `20`.
* Press `√`, enter a number like `25`, then `=`, and it will return `5`.
* Use `%` to find percentages, and `+/-` to toggle the sign.

---

## ⚠️ Known Limitations

* Code uses `==` instead of `.equals()` for string comparisons (not recommended in Java).
* Square root function only works in a specific input sequence.
* No error handling for divide-by-zero or malformed inputs yet.

---

## 📈 Future Improvements

* Replace `==` with `.equals()` for correct string comparison.
* Add memory functions (M+, M-, MR).
* Improve layout responsiveness for different window sizes.
* Add unit tests for arithmetic operations.

---

## 📝 License

This project is open-source and available under the 

---

## 👨‍💻 Author

Developed by \T S BHUVANESHWAR. Contributions and suggestions are welcome!

```

