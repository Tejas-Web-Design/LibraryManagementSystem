

/**
 * ===========================================================
 * Member.java
 * Library Management System
 *
 * Developed By : Tejasri Konidena
 * Role         : Java Intern - Developers Arena
 *
 * Description:
 * Represents a Library Member who can borrow and return books.
 * Demonstrates Object-Oriented Programming principles,
 * encapsulation, ArrayList usage, and object relationships.
 * ===========================================================
 */

import java.util.ArrayList;

public class Member  {

    // ===========================
    // Attributes
    // ===========================

    private String memberId;
    private String name;
    private String contact;
    private ArrayList<Book> borrowedBooks;

    // ===========================
    // Default Constructor
    // ===========================

    public Member() {
        borrowedBooks = new ArrayList<>();
    }

    // ===========================
    // Parameterized Constructor
    // ===========================

    public Member(String memberId, String name, String contact) {
        this.memberId = memberId;
        this.name = name;
        this.contact = contact;
        this.borrowedBooks = new ArrayList<>();
    }

    // ===========================
    // Getters
    // ===========================

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // ===========================
    // Setters
    // ===========================

    public void setMemberId(String memberId) {
        if (memberId != null && !memberId.trim().isEmpty()) {
            this.memberId = memberId;
        }
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public void setContact(String contact) {
        if (contact != null && !contact.trim().isEmpty()) {
            this.contact = contact;
        }
    }

    // ===========================
    // Borrow Book
    // ===========================

    public boolean borrowBook(Book book) {

        if (book == null) {
            return false;
        }

        if (!book.isAvailable()) {
            return false;
        }

        borrowedBooks.add(book);
        book.setAvailable(false);

        return true;
    }

    // ===========================
    // Return Book
    // ===========================

    public boolean returnBook(Book book) {

        if (book == null) {
            return false;
        }

        if (borrowedBooks.contains(book)) {

            borrowedBooks.remove(book);
            book.setAvailable(true);

            return true;
        }

        return false;
    }

    // ===========================
    // Display Member Details
    // ===========================

    public void displayMember() {

        System.out.println("-----------------------------------------------");
        System.out.println("Member ID      : " + memberId);
        System.out.println("Member Name    : " + name);
        System.out.println("Contact        : " + contact);
        System.out.println("Books Borrowed : " + borrowedBooks.size());

        if (!borrowedBooks.isEmpty()) {

            System.out.println("\nBorrowed Books:");

            for (Book book : borrowedBooks) {
                System.out.println(" • " + book.getTitle());
            }

        } else {

            System.out.println("No books borrowed.");
        }

        System.out.println("-----------------------------------------------");
    }

    // ===========================
    // Display Table Row
    // ===========================

    public void displayRow() {

        System.out.printf(
                "%-15s %-25s %-20s %-10d%n",
                memberId,
                name,
                contact,
                borrowedBooks.size());
    }

    // ===========================
    // Convert to File Format
    // ===========================

    public String toFileString() {

        return memberId + ","
                + name + ","
                + contact;
    }

    // ===========================
    // Create Member from File Data
    // ===========================

    public static Member fromFileString(String line) {

        try {

            String[] data = line.split(",");

            if (data.length != 3) {
                return null;
            }

            return new Member(
                    data[0],
                    data[1],
                    data[2]);

        } catch (Exception e) {

            return null;
        }
    }

    // ===========================
    // Override toString()
    // ===========================

    @Override
    public String toString() {

        return String.format(
                "Member ID: %s | Name: %s | Contact: %s | Borrowed Books: %d",
                memberId,
                name,
                contact,
                borrowedBooks.size());
    }
}


