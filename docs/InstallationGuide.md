# Installation Guide

## Library Management System

### Overview

This guide explains how to install, compile, and run the Library Management System on your computer.

---

# System Requirements

Before running the project, ensure that the following software is installed:

* Java Development Kit (JDK 8 or above)
* Eclipse IDE (Recommended) or any Java IDE
* Windows, macOS, or Linux Operating System

---

# Project Structure

```text
LibraryManagementSystem/
│
├── README.md
├── src/
├── docs/
├── examples/
└── screenshots/
```

---

# Installation Steps

## Step 1: Install Java

Download and install the latest Java Development Kit (JDK) from the Oracle website:

https://www.oracle.com/java/technologies/downloads/

Verify the installation:

```bash
java -version
javac -version
```

---

## Step 2: Download the Project

Clone the repository using Git:

```bash
git clone https://github.com/yourusername/LibraryManagementSystem.git
```

Or download the ZIP file from GitHub and extract it.

---

## Step 3: Open in Eclipse

1. Launch Eclipse IDE.
2. Select your workspace.
3. Click **File → Import**.
4. Choose **Existing Projects into Workspace**.
5. Select the project folder.
6. Click **Finish**.

---

## Step 4: Compile the Project

If using the terminal:

```bash
javac *.java
```

---

## Step 5: Run the Application

Execute the application using:

```bash
java LibrarySystem
```

Or simply run **LibrarySystem.java** directly from Eclipse.

---

# Data Storage

The application automatically stores library records in:

* books.txt
* members.txt

These files are created automatically if they do not already exist.

---

# Troubleshooting

### Java Not Found

Ensure the Java JDK is correctly installed and added to the system PATH.

---

### Compilation Errors

* Verify all Java source files are inside the **src** folder.
* Ensure the JDK version is Java 8 or later.

---

### File Not Found

Run the application once to generate the required data files.

---

# Successful Installation

If the application starts successfully, the following menu will appear:

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

=============================================
```

The project is now ready to use.
