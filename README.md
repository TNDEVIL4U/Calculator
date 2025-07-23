📘 Java Calculator
📌 Overview
This Java-based GUI calculator provides basic arithmetic operations using the Swing and AWT libraries. The interface mimics a traditional calculator with a display and buttons arranged in a grid layout.

🎯 Features
Addition, subtraction, multiplication, and division

Square root function

Percentage calculation

Toggle between positive/negative numbers

Clear function

Supports decimal inputs

⚙️ GUI Components
JFrame – Main application window titled "CALCULATOR".

JLabel disLabel – Display label showing inputs/results.

JPanel disPanel – Contains the display label.

JPanel buttonPanel – Contains all calculator buttons in a grid layout.

🧠 Code Structure
✅ Calculator Class
This is the main class that initializes the calculator UI and logic.

Fields:
String[] buttonValues – All button labels.

String[] rightSymbols – Right-column operator buttons (÷, x, -, +, =).

String[] topSymbols – Top-row function buttons (AC, +/-, %).

String A – First operand (as string).

String B – Second operand (as string).

String operator – Stores the operator selected.

String str – Temporary string for square root calculation.

double s – Temporary variable for square root calculation.

🧮 Functional Flow
UI Initialization
The calculator frame is built using a BorderLayout.

Display panel is placed at the top (NORTH), and button panel fills the center.

Buttons are created dynamically from buttonValues[], styled, and assigned action listeners.

Button Logic (ActionListener)
Depending on the button pressed:

➕ Arithmetic Operators (+, -, x, ÷)
On operator press, store the first number in A and the operator.

Wait for the second input.

On = press, perform the operation using A and B.

🧮 Functions (AC, +/-, %)
AC: Resets all state and display.

+/-: Negates current number.

%: Divides current number by 100.

🔢 Numbers & Decimal
Appends digits or decimal to display.

√ Square Root
When √ is pressed, √ is displayed.

When = is pressed, if √ is detected, performs square root of the number.

🧱 Methods
clearZero(double num)
Formats the number before displaying:

If the result is a whole number (e.g. 8.0), only 8 is shown.

If it's a decimal (e.g. 8.5), it's displayed as-is.

clearall()
Resets all values:

java
Copy
Edit
disLabel.setText("0");
A = "0";
B = null;
operator = null;
▶️ How to Run
Save the file as Calculator.java.

Compile and run:

bash
Copy
Edit
javac Calculator.java
java Calculator
💡 Notes & Improvements
String comparisons – Use .equals() instead of ==:

java
Copy
Edit
if (buttonPressed.equals("=")) // instead of buttonPressed == "="
Null checks – Add checks before parsing Double.parseDouble() to prevent crashes.

Better operator handling – Use enum or switch statements for better readability.

Layout Enhancements – Adjust panel spacing/margins for cleaner UI.

Code modularity – Split logic into smaller helper methods for readability and maintenance.
