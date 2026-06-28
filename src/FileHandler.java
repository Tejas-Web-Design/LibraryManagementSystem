/**
 * ==========================================================
 * FileHandler.java
 * Library Management System
 *
 * Developed By : Tejasri Konidena
 * Role         : Java Intern - Developers Arena
 *
 * Description:
 * Handles saving and loading of books and members
 * using text files.
 * ==========================================================
 */

import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    // File Names
    private static final String BOOK_FILE = "books.txt";
    private static final String MEMBER_FILE = "members.txt";

    // ==========================================
    // Save Books
    // ==========================================

    public static void saveBooks(ArrayList<Book> books) {

        try (BufferedWriter writer =
                new BufferedWriter(new FileWriter(BOOK_FILE))) {

            for (Book book : books) {

                writer.write(book.toFileString());
                writer.newLine();
            }

            System.out.println("\nBooks saved successfully.");

        } catch (IOException e) {

            System.out.println("Error saving books: "
                    + e.getMessage());
        }
    }

    // ==========================================
    // Load Books
    // ==========================================

    public static ArrayList<Book> loadBooks() {

        ArrayList<Book> books = new ArrayList<>();

        File file = new File(BOOK_FILE);

        if (!file.exists()) {

            return books;
        }

        try (BufferedReader reader =
                new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = reader.readLine()) != null) {

                Book book = Book.fromFileString(line);

                if (book != null) {

                    books.add(book);
                }
            }

        } catch (IOException e) {

            System.out.println("Error loading books: "
                    + e.getMessage());
        }

        return books;
    }

    // ==========================================
    // Save Members
    // ==========================================

    public static void saveMembers(ArrayList<Member> members) {

        try (BufferedWriter writer =
                new BufferedWriter(new FileWriter(MEMBER_FILE))) {

            for (Member member : members) {

                writer.write(member.toFileString());
                writer.newLine();
            }

            System.out.println("\nMembers saved successfully.");

        } catch (IOException e) {

            System.out.println("Error saving members: "
                    + e.getMessage());
        }
    }

    // ==========================================
    // Load Members
    // ==========================================

    public static ArrayList<Member> loadMembers() {

        ArrayList<Member> members = new ArrayList<>();

        File file = new File(MEMBER_FILE);

        if (!file.exists()) {

            return members;
        }

        try (BufferedReader reader =
                new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = reader.readLine()) != null) {

                Member member =
                        Member.fromFileString(line);

                if (member != null) {

                    members.add(member);
                }
            }

        } catch (IOException e) {

            System.out.println("Error loading members: "
                    + e.getMessage());
        }

        return members;
    }

    // ==========================================
    // Save Entire Library
    // ==========================================

    public static void saveLibrary(Library library) {

        saveBooks(library.getBooks());
        saveMembers(library.getMembers());

        System.out.println("\nLibrary data saved successfully.");
    }

    // ==========================================
    // Load Entire Library
    // ==========================================

    public static void loadLibrary(Library library) {

        library.clearLibrary();

        library.getBooks().addAll(loadBooks());

        library.getMembers().addAll(loadMembers());

        System.out.println("\nLibrary data loaded successfully.");
    }

}