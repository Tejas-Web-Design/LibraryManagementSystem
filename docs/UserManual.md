# User Manual

## Library Management System

### Introduction

The Library Management System is a Java console-based application designed to simplify library operations. This manual explains how to use each feature of the application.

---

# Starting the Application

Run the program by executing:

```bash
java LibrarySystem
```

The main menu will be displayed.

---

# Main Menu

```text
========= LIBRARY MANAGEMENT SYSTEM =========

1. Add Book
2. Register Member
3. Search Book
4. Borrow Book
5. Return Book
6. View Books
7. View Members
8. Generate Report
9. Exit
```

Choose the required option by entering its corresponding number.

---

# Features

## 1. Add Book

Allows the librarian to add a new book to the library.

Required Information:

* ISBN
* Book Title
* Author Name
* Genre

After entering valid details, the book is added successfully.

---

## 2. Register Member

Registers a new library member.

Required Information:

* Member ID
* Member Name
* Contact Number

The member record is stored for future borrowing activities.

---

## 3. Search Book

Users can search books using:

* ISBN
* Title
* Author

If the book exists, complete details are displayed.

---

## 4. Borrow Book

Borrowing a book requires:

* Member ID
* ISBN

The system verifies:

* Member exists
* Book exists
* Book is available

If all conditions are satisfied, the book is issued successfully.

---

## 5. Return Book

Allows members to return borrowed books.

Required Information:

* Member ID
* ISBN

The book status is updated automatically.

---

## 6. View Books

Displays all books stored in the library with:

* ISBN
* Title
* Author
* Genre
* Availability Status

---

## 7. View Members

Displays all registered members and their information.

---

## 8. Generate Report

Generates a summary including:

* Total Books
* Available Books
* Borrowed Books
* Registered Members

---

## Input Validation

The system validates all user inputs.

Examples include:

* Empty fields are not accepted.
* Duplicate ISBNs are not allowed.
* Duplicate Member IDs are not allowed.
* Invalid menu choices display an error message.

---

## Error Handling

The application handles common errors such as:

* Invalid menu selections
* Missing records
* Duplicate entries
* File reading/writing errors

Appropriate error messages are displayed without crashing the program.

---

## Saving Data

Library records are automatically saved in:

* books.txt
* members.txt

Data is loaded automatically whenever the application starts.

---

## Best Practices

* Enter unique ISBNs for each book.
* Register members before borrowing books.
* Save data before exiting the application.
* Keep backup copies of the data files if necessary.

---

## Exit

Select the **Exit** option from the main menu to safely close the application.

Thank you for using the **Library Management System**.
