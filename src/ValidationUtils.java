/**
 * ==========================================================
 * ValidationUtils.java
 * Library Management System
 *
 * Developed By : Tejasri Konidena
 * Role         : Java Intern - Developers Arena
 *
 * Description:
 * Utility class containing methods for validating
 * user inputs such as ISBN, Member ID, Name,
 * Contact Number, Menu Choice, and Integer inputs.
 * ==========================================================
 */

import java.util.Scanner;

public class ValidationUtils {

    // ==========================================
    // Validate Name
    // ==========================================

    public static boolean isValidName(String name) {

        if (name == null || name.trim().isEmpty()) {
            return false;
        }

        return name.matches("[A-Za-z ]+");
    }

    // ==========================================
    // Validate ISBN
    // ==========================================

    public static boolean isValidISBN(String isbn) {

        if (isbn == null || isbn.trim().isEmpty()) {
            return false;
        }

        return isbn.matches("[A-Za-z0-9-]+");
    }

    // ==========================================
    // Validate Member ID
    // ==========================================

    public static boolean isValidMemberId(String memberId) {

        if (memberId == null || memberId.trim().isEmpty()) {
            return false;
        }

        return memberId.matches("[A-Za-z0-9]+");
    }

    // ==========================================
    // Validate Contact Number
    // ==========================================

    public static boolean isValidContact(String contact) {

        if (contact == null || contact.trim().isEmpty()) {
            return false;
        }

        return contact.matches("\\d{10}");
    }

    // ==========================================
    // Validate Menu Choice
    // ==========================================

    public static int getValidMenuChoice(Scanner scanner) {

        while (true) {

            try {

                System.out.print("Enter your choice: ");

                int choice = Integer.parseInt(scanner.nextLine());

                return choice;

            } catch (NumberFormatException e) {

                System.out.println("Invalid input! Please enter a number.");
            }
        }
    }

    // ==========================================
    // Validate Integer Input
    // ==========================================

    public static int getValidInteger(Scanner scanner, String message) {

        while (true) {

            try {

                System.out.print(message);

                int value = Integer.parseInt(scanner.nextLine());

                return value;

            } catch (NumberFormatException e) {

                System.out.println("Please enter a valid integer.");
            }
        }
    }

    // ==========================================
    // Validate Non-Empty String
    // ==========================================

    public static String getNonEmptyInput(Scanner scanner, String message) {

        while (true) {

            System.out.print(message);

            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {

                return input;
            }

            System.out.println("Input cannot be empty.");
        }
    }

    // ==========================================
    // Validate Book Title
    // ==========================================

    public static String getValidTitle(Scanner scanner) {

        while (true) {

            System.out.print("Enter Book Title: ");

            String title = scanner.nextLine().trim();

            if (!title.isEmpty()) {

                return title;
            }

            System.out.println("Book title cannot be empty.");
        }
    }

    // ==========================================
    // Validate Author Name
    // ==========================================

    public static String getValidAuthor(Scanner scanner) {

        while (true) {

            System.out.print("Enter Author Name: ");

            String author = scanner.nextLine().trim();

            if (isValidName(author)) {

                return author;
            }

            System.out.println("Invalid author name.");
        }
    }

    // ==========================================
    // Validate Genre
    // ==========================================

    public static String getValidGenre(Scanner scanner) {

        while (true) {

            System.out.print("Enter Genre: ");

            String genre = scanner.nextLine().trim();

            if (!genre.isEmpty()) {

                return genre;
            }

            System.out.println("Genre cannot be empty.");
        }
    }

    // ==========================================
    // Validate ISBN Input
    // ==========================================

    public static String getValidISBNInput(Scanner scanner) {

        while (true) {

            System.out.print("Enter ISBN: ");

            String isbn = scanner.nextLine().trim();

            if (isValidISBN(isbn)) {

                return isbn;
            }

            System.out.println("Invalid ISBN.");
        }
    }

    // ==========================================
    // Validate Member ID Input
    // ==========================================

    public static String getValidMemberIdInput(Scanner scanner) {

        while (true) {

            System.out.print("Enter Member ID: ");

            String id = scanner.nextLine().trim();

            if (isValidMemberId(id)) {

                return id;
            }

            System.out.println("Invalid Member ID.");
        }
    }

    // ==========================================
    // Validate Contact Input
    // ==========================================

    public static String getValidContactInput(Scanner scanner) {

        while (true) {

            System.out.print("Enter Contact Number: ");

            String contact = scanner.nextLine().trim();

            if (isValidContact(contact)) {

                return contact;
            }

            System.out.println("Contact number must contain exactly 10 digits.");
        }
    }

}