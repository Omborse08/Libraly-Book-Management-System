# 📚 Library Management System (Core Java, OOP)

A console-based Library Management System built using **Core Java** with a strong focus on **Object-Oriented Programming principles**.

This project was created to deeply understand:
- Encapsulation
- Separation of responsibilities
- Object state management
- Array-based object storage (before Collections)

---

## 🚀 Features

- Add books to the library
- Register library members
- Issue books to members
- Return issued books
- Search books by ID
- Prevent:
  - Issuing the same book twice
  - Issuing multiple books to one member

---

## 🧠 OOP Design Overview

### 📦 Entities
- **Books**
  - Holds book data and availability state
- **Members**
  - Holds member data and issued book state

### 🧠 Manager
- **Libraly**
  - Stores books and members
  - Coordinates issuing and returning of books
  - Does NOT handle UI or user input

### 🖥️ UI Layer
- **LibralyFrontend**
  - Handles all user input/output
  - Calls manager methods
  - No business logic inside UI

---

## 🛠️ Technologies Used

- Java (Core Java)
- Arrays (no Collections used intentionally)
- OOP Principles

---

## ⚠️ Design Decisions

- Fixed-size arrays are used intentionally to practice low-level object handling.
- No database or file storage (in-memory only).
- Single book per member allowed (by design).

---

## ▶️ How to Run

1. Clone the repository
2. Compile all `.java` files
3. Run `LibralyFrontend.java`
4. Use the console menu

---

## 🎯 Learning Outcome

This project helped me:
- Think in terms of objects, not just syntax
- Understand where business logic should live
- Avoid common OOP mistakes (God class, logic in UI, etc.)

---

## 📌 Next Improvements

- Convert arrays to ArrayList
- Add exception handling
- Improve search performance
- Introduce interfaces and abstraction

---

⭐ If you are learning Java OOP, feel free to explore or suggest improvements.
