/**
 * ==========================================================
 * LibrarySystem.java
 * Library Management System
 *
 * Developed By : Tejasri Konidena
 * Role         : Java Intern - Developers Arena
 *
 * Description:
 * Main class of the Library Management System.
 * Handles the menu-driven interface and coordinates
 * all library operations.
 * ==========================================================
 */

import java.util.Scanner;

public class LibrarySystem {

    // ==========================================
    // Global Objects
    // ==========================================

    private static Library library = new Library();
    private static Scanner scanner = new Scanner(System.in);

    // ==========================================
    // Main Method
    // ==========================================

    public static void main(String[] args) {

        // Load existing data
        FileHandler.loadLibrary(library);

        boolean running = true;

        while (running) {

            displayMenu();

            int choice = ValidationUtils.getValidMenuChoice(scanner);

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    registerMember();
                    break;

                case 3:
                    library.displayAllBooks();
                    break;

                case 4:
                    library.displayMembers();
                    break;

                case 5:
                    searchBookMenu();
                    break;

                case 6:
                    borrowBook();
                    break;

                case 7:
                    returnBook();
                    break;

                case 8:
                    library.displayBorrowedBooks();
                    break;

                case 9:
                    library.displayStatistics();
                    break;

                case 10:
                    library.generateLibraryReport();
                    break;

                case 11:
                    FileHandler.saveLibrary(library);
                    break;

                case 12:

                    FileHandler.saveLibrary(library);

                    System.out.println();
                    System.out.println("====================================");
                    System.out.println(" Thank you for using Library System ");
                    System.out.println("====================================");

                    running = false;
                    break;

                default:

                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }

    // ==========================================
    // Display Menu
    // ==========================================

    private static void displayMenu() {

        System.out.println();
        System.out.println("=================================================");
        System.out.println("         LIBRARY MANAGEMENT SYSTEM");
        System.out.println("=================================================");
        System.out.println("1.  Add New Book");
        System.out.println("2.  Register Member");
        System.out.println("3.  View All Books");
        System.out.println("4.  View Members");
        System.out.println("5.  Search Book");
        System.out.println("6.  Borrow Book");
        System.out.println("7.  Return Book");
        System.out.println("8.  View Borrowed Books");
        System.out.println("9.  Library Statistics");
        System.out.println("10. Generate Report");
        System.out.println("11. Save Library Data");
        System.out.println("12. Exit");
        System.out.println("=================================================");
    }

    // ==========================================
    // Add New Book
    // ==========================================

    private static void addBook() {

        System.out.println();
        System.out.println("========== ADD NEW BOOK ==========");

        String isbn =
                ValidationUtils.getValidISBNInput(scanner);

        String title =
                ValidationUtils.getValidTitle(scanner);

        String author =
                ValidationUtils.getValidAuthor(scanner);

        String genre =
                ValidationUtils.getValidGenre(scanner);

        Book book =
                new Book(isbn, title, author, genre);

        library.addBook(book);
    }

    // ==========================================
    // Register Member
    // ==========================================

    private static void registerMember() {

        System.out.println();
        System.out.println("========== REGISTER MEMBER ==========");

        String memberId =
                ValidationUtils.getValidMemberIdInput(scanner);

        String name =
                ValidationUtils.getNonEmptyInput(
                        scanner,
                        "Enter Member Name: ");

        String contact =
                ValidationUtils.getValidContactInput(scanner);

        Member member =
                new Member(memberId, name, contact);

        library.addMember(member);
    }

    // ==========================================
    // Search Menu
    // ==========================================

    private static void searchBookMenu() {

        System.out.println();
        System.out.println("========= SEARCH BOOK =========");
        System.out.println("1. Search by ISBN");
        System.out.println("2. Search by Title");
        System.out.println("3. Search by Author");

        int choice =
                ValidationUtils.getValidMenuChoice(scanner);

        switch (choice) {

            case 1:

                String isbn =
                        ValidationUtils.getValidISBNInput(scanner);

                Book book =
                        library.findBookByISBN(isbn);

                if (book != null)
                    book.displayBook();
                else
                    System.out.println("Book not found.");

                break;

            case 2:

                System.out.print("Enter Title: ");
                library.searchBookByTitle(scanner.nextLine());

                break;

            case 3:

                System.out.print("Enter Author: ");
                library.searchBookByAuthor(scanner.nextLine());

                break;

            default:

                System.out.println("Invalid choice.");
        }
    }
   
    // ==========================================
    // Borrow Book
    // ==========================================

    private static void borrowBook() {

        System.out.println();
        System.out.println("========== BORROW BOOK ==========");

        String memberId =
                ValidationUtils.getValidMemberIdInput(scanner);

        String isbn =
                ValidationUtils.getValidISBNInput(scanner);

        library.borrowBook(memberId, isbn);
    }

    // ==========================================
    // Return Book
    // ==========================================

    private static void returnBook() {

        System.out.println();
        System.out.println("========== RETURN BOOK ==========");

        String memberId =
                ValidationUtils.getValidMemberIdInput(scanner);

        String isbn =
                ValidationUtils.getValidISBNInput(scanner);

        library.returnBook(memberId, isbn);
    }

    // ==========================================
    // Remove Book
    // ==========================================

    private static void removeBook() {

        System.out.println();
        System.out.println("========== REMOVE BOOK ==========");

        String isbn =
                ValidationUtils.getValidISBNInput(scanner);

        library.removeBook(isbn);
    }

    // ==========================================
    // Remove Member
    // ==========================================

    private static void removeMember() {

        System.out.println();
        System.out.println("========== REMOVE MEMBER ==========");

        String memberId =
                ValidationUtils.getValidMemberIdInput(scanner);

        library.removeMember(memberId);
    }

    // ==========================================
    // View Available Books
    // ==========================================

    private static void viewAvailableBooks() {

        System.out.println();
        library.displayAvailableBooks();
    }

    // ==========================================
    // Save Library Data
    // ==========================================

    private static void saveLibraryData() {

        FileHandler.saveLibrary(library);

        System.out.println();
        System.out.println("Library data saved successfully.");
    }

    // ==========================================
    // Load Library Data
    // ==========================================

    private static void loadLibraryData() {

        FileHandler.loadLibrary(library);

        System.out.println();
        System.out.println("Library data loaded successfully.");
    }

    // ==========================================
    // Display Statistics
    // ==========================================

    private static void showStatistics() {

        System.out.println();
        library.displayStatistics();
    }

    // ==========================================
    // Generate Report
    // ==========================================

    private static void generateReport() {

        System.out.println();
        library.generateLibraryReport();
    }

    // ==========================================
    // About Project
    // ==========================================

    private static void aboutProject() {

        System.out.println();
        System.out.println("==============================================");
        System.out.println("        LIBRARY MANAGEMENT SYSTEM");
        System.out.println("==============================================");
        System.out.println("Developer : Tejasri Konidena");
        System.out.println("Role      : Java Intern");
        System.out.println("Organization : Developers Arena");
        System.out.println();
        System.out.println("Features:");
        System.out.println("• Book Management");
        System.out.println("• Member Registration");
        System.out.println("• Borrow & Return Books");
        System.out.println("• Search by ISBN/Title/Author");
        System.out.println("• Library Statistics");
        System.out.println("• Report Generation");
        System.out.println("• File Handling");
        System.out.println("==============================================");
    }

    // ==========================================
    // Pause Screen
    // ==========================================

    private static void pressEnterToContinue() {

        System.out.println();
        System.out.print("Press ENTER to continue...");

        scanner.nextLine();
    }
}