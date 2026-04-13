#  Custom StringBuilder with Undo

##  Overview
This project is a custom implementation of Java's StringBuilder with an added **undo()** functionality using the **Memento Design Pattern**.

---

##  Concepts Used
- Stack (for storing history)
- Memento Pattern (snapshot-based undo)
- Object-Oriented Programming (OOP)

---

## Features
- append(String str)
- delete(int n)
- replace(int start, int end, String str)
- undo()

---

## How to Run

```bash
javac src/*.java
java -cp src Main