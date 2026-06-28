/**
 * ===========================================================
 * Book.java
 * Library Management System
 *
 * Developed By : Tejasri Konidena
 * Role         : Java Intern - Developers Arena
 *
 * Description:
 * Represents a Book object in the Library Management System.
 * Demonstrates encapsulation using private fields and
 * public getter/setter methods.
 * ===========================================================
 */

public class Book {

    // ===========================
    // Attributes
    // ===========================

    private String isbn;
    private String title;
    private String author;
    private String genre;
    private boolean available;

    // ===========================
    // Default Constructor
    // ===========================

    public Book() {
        this.available = true;
    }

    // ===========================
    // Parameterized Constructor
    // ===========================

    public Book(String isbn, String title, String author, String genre) {

        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = true;
    }

    // ===========================
    // Getters
    // ===========================

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return available;
    }

    // ===========================
    // Setters
    // ===========================

    public void setIsbn(String isbn) {

        if (isbn != null && !isbn.trim().isEmpty()) {
            this.isbn = isbn;
        }
    }

    public void setTitle(String title) {

        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        }
    }

    public void setAuthor(String author) {

        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        }
    }

    public void setGenre(String genre) {

        if (genre != null && !genre.trim().isEmpty()) {
            this.genre = genre;
        }
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // ===========================
    // Display Book Details
    // ===========================

    public void displayBook() {

        System.out.println("---------------------------------------------");
        System.out.println("ISBN       : " + isbn);
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Genre      : " + genre);
        System.out.println("Status     : "
                + (available ? "Available" : "Borrowed"));
        System.out.println("---------------------------------------------");
    }

    // ===========================
    // Display Book in Table Format
    // ===========================

    public void displayRow() {

        System.out.printf(
                "%-18s %-28s %-22s %-18s %-12s%n",
                isbn,
                title,
                author,
                genre,
                available ? "Available" : "Borrowed");
    }

    // ===========================
    // Convert Book to File Format
    // ===========================

    public String toFileString() {

        return isbn + ","
                + title + ","
                + author + ","
                + genre + ","
                + available;
    }

    // ===========================
    // Create Book from File Data
    // ===========================

    public static Book fromFileString(String line) {

        try {

            String[] data = line.split(",");

            if (data.length != 5) {
                return null;
            }

            Book book = new Book();

            book.setIsbn(data[0]);
            book.setTitle(data[1]);
            book.setAuthor(data[2]);
            book.setGenre(data[3]);
            book.setAvailable(Boolean.parseBoolean(data[4]));

            return book;

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
                "ISBN: %s | Title: %s | Author: %s | Genre: %s | Status: %s",
                isbn,
                title,
                author,
                genre,
                available ? "Available" : "Borrowed");
    }
}