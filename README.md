# 📚 Library Management System

> A Java-based console application developed to efficiently manage books and library members through a menu-driven interface.

![Java](https://img.shields.io/badge/Java-17+-orange?logo=java)
![OOP](https://img.shields.io/badge/OOP-Object--Oriented-blue)
![IDE](https://img.shields.io/badge/IDE-Eclipse-purple)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![License](https://img.shields.io/badge/License-Educational-lightgrey)

---

## 📖 Project Overview

The **Library Management System** is a Java console-based application designed to automate basic library operations. It enables users to manage books and library members, perform borrowing and returning operations, search records, generate reports, and maintain persistent data using text files.

This project was developed as part of the **Java Internship at Developers Arena** to demonstrate practical implementation of Java programming concepts and Object-Oriented Programming principles.

---

## ✨ Features

- 📚 Add New Books
- 👤 Register Library Members
- 🔍 Search Books (ISBN, Title, Author)
- 📖 Borrow Books
- 🔄 Return Books
- 📋 View Available Books
- 👥 View Registered Members
- 📊 Generate Library Statistics
- 📄 Generate Library Reports
- 💾 Save & Load Data Using Text Files
- ✅ Input Validation
- ⚠ Exception Handling
- 🖥 Menu-Driven Console Interface

---

## 🛠 Technologies Used

| Technology | Purpose |
|------------|---------|
| Java | Programming Language |
| JDK 8+ | Development Kit |
| Eclipse IDE | Development Environment |
| Scanner | User Input |
| ArrayList | Dynamic Data Storage |
| BufferedReader | Read Files |
| BufferedWriter | Write Files |
| File Handling | Data Persistence |
| Exception Handling | Error Management |
| OOP Concepts | Software Design |

---

## 📂 Project Structure

```text
LibraryManagementSystem/
│
├── README.md
│
├── src/
│   ├── Book.java
│   ├── Member.java
│   ├── Library.java
│   ├── ValidationUtils.java
│   ├── FileHandler.java
│   └── LibrarySystem.java
│
├── docs/
│   ├── ProjectDocumentation.docx
│   ├── InstallationGuide.md
│   └── UserManual.md
│
├── examples/
│   ├── books.txt
│   ├── members.txt
│   └── sample-data.txt
│
└── screenshots/
```

---

## ⚙ Installation

### Prerequisites

- Java JDK 8 or above
- Eclipse IDE (or any Java IDE)

---

## 📌 How to Use

1. Run the application.
2. Choose an option from the main menu.
3. Add books or register members.
4. Borrow or return books.
5. Search books by ISBN, title, or author.
6. Generate reports and statistics.
7. Save data before exiting.

---

## 🏗 System Architecture

```text
             User
               │
               ▼
      LibrarySystem.java
               │
   ┌───────────┼───────────┐
   ▼           ▼           ▼
Validation   Library   FileHandler
               │
      ┌────────┴────────┐
      ▼                 ▼
   Book.java       Member.java
               │
               ▼
      books.txt / members.txt
```

---

## 🧩 OOP Concepts Implemented

- Encapsulation
- Classes & Objects
- Constructors
- Abstraction
- Modular Programming
- Code Reusability

---

## 📸 Screenshots

Add screenshots of:

- Main Menu

<img width="1431" height="432" alt="Screenshot 2026-06-28 214712" src="https://github.com/user-attachments/assets/a80df6cc-b6ef-4ce2-865f-c90996aacc16" />

- Add Book

<img width="1256" height="625" alt="Screenshot 2026-06-28 215210" src="https://github.com/user-attachments/assets/2e70c070-ca62-43b5-99a4-30c6e447739f" />

- Register Member

<img width="1337" height="593" alt="Screenshot 2026-06-28 215514" src="https://github.com/user-attachments/assets/06e18766-85fe-4c1a-b226-79e502f33aa5" />

- Search Book

<img width="1455" height="865" alt="Screenshot 2026-06-28 215800" src="https://github.com/user-attachments/assets/537a3fd2-28f4-472b-af84-14fd107f6a3a" />

- Borrow Book

<img width="1362" height="600" alt="Screenshot 2026-06-28 215850" src="https://github.com/user-attachments/assets/f4e3641a-8ccd-4df0-a0ae-5eebd52571e3" />

- Return Book

<img width="1367" height="543" alt="Screenshot 2026-06-28 215939" src="https://github.com/user-attachments/assets/5b6fc21d-e2f3-4922-9038-52242f2a12e9" />

- View Books

<img width="1272" height="617" alt="Screenshot 2026-06-28 215608" src="https://github.com/user-attachments/assets/c15161ec-e633-465b-8c38-630bf8d4fc63" />

- Statistics

<img width="1091" height="532" alt="Screenshot 2026-06-28 220010" src="https://github.com/user-attachments/assets/82395e2c-2dcc-45b0-9ff7-3fa510d8c0fb" />

- Report Generation

<img width="1427" height="857" alt="Screenshot 2026-06-28 220037" src="https://github.com/user-attachments/assets/5e0c27ea-fcaf-4042-b429-500e0a9dc5af" />

---

## 🧪 Testing

The application has been tested for:

- ✅ Add Book
- ✅ Register Member
- ✅ Search Book
- ✅ Borrow Book
- ✅ Return Book
- ✅ File Saving
- ✅ File Loading
- ✅ Input Validation
- ✅ Exception Handling

---

## 🚀 Future Enhancements

- GUI using Java Swing or JavaFX
- Database Integration (MySQL)
- Login & Authentication
- Fine Calculation
- Book Reservation System
- Barcode Integration
- Due Date Notifications
- Admin Dashboard

---

## 👩‍💻 Developer

**Tejasri Konidena**

**Java Intern**

**Developers Arena**

---

## 📄 License

This project was developed for **educational and internship purposes only** as part of the **Developers Arena Java Internship Program**.

---

## ⭐ Acknowledgement

I sincerely thank **Developers Arena** for providing the opportunity to work on this project. It has enhanced my understanding of Java programming, Object-Oriented Programming, file handling, collections, exception handling, and software development best practices.

---

### 🌟 If you found this project useful, consider giving it a ⭐ on GitHub!
