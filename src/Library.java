/**
 * ==========================================================
 * Library.java
 * Library Management System
 *
 * Developed By : Tejasri Konidena
 * Role         : Java Intern - Developers Arena
 *
 * Description:
 * This class manages all library operations including
 * adding books, registering members, searching books,
 * displaying books and members.
 * ==========================================================
 */

import java.util.ArrayList;

public class Library {

    // ==========================================
    // Attributes
    // ==========================================

    private ArrayList<Book> books;
    private ArrayList<Member> members;

    // ==========================================
    // Constructor
    // ==========================================

    public Library() {

        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // ==========================================
    // Add Book
    // ==========================================

    public boolean addBook(Book book) {

        if (book == null)
            return false;

        if (findBookByISBN(book.getIsbn()) != null) {

            System.out.println("\nBook with same ISBN already exists.");
            return false;
        }

        books.add(book);

        System.out.println("\nBook added successfully.");

        return true;
    }

    // ==========================================
    // Register Member
    // ==========================================

    public boolean addMember(Member member) {

        if (member == null)
            return false;

        if (findMemberById(member.getMemberId()) != null) {

            System.out.println("\nMember ID already exists.");
            return false;
        }

        members.add(member);

        System.out.println("\nMember registered successfully.");

        return true;
    }

    // ==========================================
    // Find Book by ISBN
    // ==========================================

    public Book findBookByISBN(String isbn) {

        for (Book book : books) {

            if (book.getIsbn().equalsIgnoreCase(isbn)) {

                return book;
            }
        }

        return null;
    }

    // ==========================================
    // Find Member by ID
    // ==========================================

    public Member findMemberById(String memberId) {

        for (Member member : members) {

            if (member.getMemberId().equalsIgnoreCase(memberId)) {

                return member;
            }
        }

        return null;
    }

    // ==========================================
    // Search Books by Title
    // ==========================================

    public void searchBookByTitle(String title) {

        boolean found = false;

        System.out.println("\n========== SEARCH RESULT ==========");

        for (Book book : books) {

            if (book.getTitle().toLowerCase()
                    .contains(title.toLowerCase())) {

                book.displayBook();
                found = true;
            }
        }

        if (!found) {

            System.out.println("No matching books found.");
        }
    }

    // ==========================================
    // Search Books by Author
    // ==========================================

    public void searchBookByAuthor(String author) {

        boolean found = false;

        System.out.println("\n========== SEARCH RESULT ==========");

        for (Book book : books) {

            if (book.getAuthor().toLowerCase()
                    .contains(author.toLowerCase())) {

                book.displayBook();
                found = true;
            }
        }

        if (!found) {

            System.out.println("No matching books found.");
        }
    }

    // ==========================================
    // Display All Books
    // ==========================================

    public void displayAllBooks() {

        if (books.isEmpty()) {

            System.out.println("\nNo books available.");
            return;
        }

        System.out.println(
                "\n==============================================================================================");

        System.out.printf("%-18s %-28s %-22s %-18s %-12s%n",
                "ISBN",
                "TITLE",
                "AUTHOR",
                "GENRE",
                "STATUS");

        System.out.println(
                "==============================================================================================");

        for (Book book : books) {

            book.displayRow();
        }

        System.out.println(
                "==============================================================================================");
    }

    // ==========================================
    // Display Available Books
    // ==========================================

    public void displayAvailableBooks() {

        boolean found = false;

        System.out.println(
                "\n==============================================================================================");

        System.out.printf("%-18s %-28s %-22s %-18s %-12s%n",
                "ISBN",
                "TITLE",
                "AUTHOR",
                "GENRE",
                "STATUS");

        System.out.println(
                "==============================================================================================");

        for (Book book : books) {

            if (book.isAvailable()) {

                book.displayRow();
                found = true;
            }
        }

        if (!found) {

            System.out.println("No books available.");
        }

        System.out.println(
                "==============================================================================================");
    }

    // ==========================================
    // Display All Members
    // ==========================================

    public void displayMembers() {

        if (members.isEmpty()) {

            System.out.println("\nNo registered members.");
            return;
        }

        System.out.println(
                "\n===========================================================================");

        System.out.printf("%-15s %-25s %-20s %-10s%n",
                "Member ID",
                "Name",
                "Contact",
                "Borrowed");

        System.out.println(
                "===========================================================================");

        for (Member member : members) {

            member.displayRow();
        }

        System.out.println(
                "===========================================================================");
    }

    // ==========================================
    // Getter Methods
    // ==========================================

    public ArrayList<Book> getBooks() {

        return books;
    }

    public ArrayList<Member> getMembers() {

        return members;
    }



// ==========================================
// Borrow Book
// ==========================================

public boolean borrowBook(String memberId, String isbn) {

    Member member = findMemberById(memberId);
    Book book = findBookByISBN(isbn);

    if (member == null) {
        System.out.println("\nMember not found.");
        return false;
    }

    if (book == null) {
        System.out.println("\nBook not found.");
        return false;
    }

    if (!book.isAvailable()) {
        System.out.println("\nBook is already borrowed.");
        return false;
    }

    if (member.borrowBook(book)) {

        System.out.println("\n======================================");
        System.out.println(" 📖 Book borrowed successfully.");
        System.out.println("Member : " + member.getName());
        System.out.println("Book   : " + book.getTitle());
        System.out.println("======================================");

        return true;
    }

    return false;
}

// ==========================================
// Return Book
// ==========================================

public boolean returnBook(String memberId, String isbn) {

    Member member = findMemberById(memberId);
    Book book = findBookByISBN(isbn);

    if (member == null) {

        System.out.println("\nMember not found.");
        return false;
    }

    if (book == null) {

        System.out.println("\nBook not found.");
        return false;
    }

    if (member.returnBook(book)) {

        System.out.println("\n 🔄 Book returned successfully.");
        return true;
    }

    System.out.println("\nThis member has not borrowed this book.");

    return false;
}

// ==========================================
// Remove Book
// ==========================================

public boolean removeBook(String isbn) {

    Book book = findBookByISBN(isbn);

    if (book == null) {

        System.out.println("\nBook not found.");
        return false;
    }

    if (!book.isAvailable()) {

        System.out.println("\nCannot remove a borrowed book.");
        return false;
    }

    books.remove(book);

    System.out.println("\n 🧹 Book removed successfully.");

    return true;
}

// ==========================================
// Remove Member
// ==========================================

public boolean removeMember(String memberId) {

    Member member = findMemberById(memberId);

    if (member == null) {

        System.out.println("\nMember not found.");
        return false;
    }

    if (!member.getBorrowedBooks().isEmpty()) {

        System.out.println("\nMember still has borrowed books.");
        return false;
    }

    members.remove(member);

    System.out.println("\n 👤 Member removed successfully.");

    return true;
}

// ==========================================
// Display Borrowed Books
// ==========================================

public void displayBorrowedBooks() {

    boolean found = false;

    System.out.println("\n=============📚 BORROWED BOOKS =============");

    for (Book book : books) {

        if (!book.isAvailable()) {

            book.displayBook();
            found = true;
        }
    }

    if (!found) {

        System.out.println("No books are currently borrowed.");
    }
}

// ==========================================
// Library Statistics
// ==========================================

public void displayStatistics() {

    int available = 0;
    int borrowed = 0;

    for (Book book : books) {

        if (book.isAvailable())
            available++;
        else
            borrowed++;
    }

    System.out.println("\n===========📊 LIBRARY STATISTICS ===========");

    System.out.println("Total Books        : " + books.size());
    System.out.println("Available Books    : " + available);
    System.out.println("Borrowed Books     : " + borrowed);
    System.out.println("Registered Members : " + members.size());

    System.out.println("==========================================");
}

// ==========================================
// Most Active Member
// ==========================================

public void displayTopMember() {

    if (members.isEmpty()) {

        System.out.println("\nNo registered members.");
        return;
    }

    Member top = members.get(0);

    for (Member member : members) {

        if (member.getBorrowedBooks().size()
                > top.getBorrowedBooks().size()) {

            top = member;
        }
    }

    System.out.println("\n============= 🏆 TOP MEMBER =============");

    System.out.println("Member ID : " + top.getMemberId());
    System.out.println("Name      : " + top.getName());
    System.out.println("Books Borrowed : "
            + top.getBorrowedBooks().size());

    System.out.println("======================================");
}

// ==========================================
// Library Summary Report
// ==========================================

public void generateLibraryReport() {

    System.out.println("\n==============================================");
    System.out.println("       📋 LIBRARY SUMMARY REPORT");
    System.out.println("==============================================");

    displayStatistics();

    System.out.println();

    displayTopMember();

    System.out.println("\nBooks in Library : " + books.size());
    System.out.println("Members          : " + members.size());

    System.out.println("==============================================");
}

// ==========================================
// Clear Library
// ==========================================

public void clearLibrary() {

    books.clear();
    members.clear();
}

}