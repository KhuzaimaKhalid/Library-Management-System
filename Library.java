import java.util.Scanner;

class Book{
    private String bookid;
    private String title;
    private String author;
    private boolean availability;


    public Book(String title, String bookid, String author, boolean availability) {
        this.title = title;
        this.bookid = bookid;
        this.author = author;
        this.availability = availability;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    public void updateAvailability(boolean status) {
        this.availability = status;
        System.out.println("Availability updated for book " + this.bookid + " to " + status);
    }
    public void removeBook() {
        this.bookid = null;
        this.title = null;
        this.author = null;
        this.availability = false;
        System.out.println("Book record removed.");
    }
    public void displayBookInfo() {
        if (this.bookid == null) {
            System.out.println("Record not found. Book has been removed.");
        } else {
            System.out.println("===================================================================================");
            System.out.println("Book ID    : " + bookid);
            System.out.println("Title      : " + title);
            System.out.println("Author     : " + author);
            System.out.println("Available  : " + availability);
            System.out.println("====================================================================================");
        }
    }

}


public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[3];
        int count = 0;

        // 1. Hardcoded book records
        Book b1 = new Book("B101", "1984", "George Orwell", true);
        Book b2 = new Book("B102", "To Kill a Mockingbird", "Harper Lee", true);
        books[count++] = b1;
        books[count++] = b2;

        // 2. User-defined book record
        System.out.println("********************    Enter new book details  ***********************");
        System.out.print("Book ID: ");
        String id = sc.nextLine();
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Author: ");
        String author = sc.nextLine();
        System.out.print("Is Available (true/false): ");
        boolean available = sc.nextBoolean();
        sc.nextLine();  // consume newline
        Book b3 = new Book(id, title, author, available);
        books[count++] = b3;

        // 3. Display all book records
        System.out.println("\n--- Book Records ---");
        for (int i = 0; i < count; i++) {
            books[i].displayBookInfo();
        }

        // 4. Update availability
        System.out.print("\nEnter Book ID to update availability: ");
        String searchId = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].getBookid() != null
                    && books[i].getBookid().equals(searchId)) {
                System.out.print("Enter new availability status (true/false): ");
                boolean status = sc.nextBoolean();
                books[i].updateAvailability(status);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ID " + searchId + " not found.");
        }
        sc.nextLine();  // consume newline

        // 5. Remove a book record
        System.out.print("\nEnter Book ID to remove: ");
        String removeId = sc.nextLine();
        found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].getBookid() != null
                    && books[i].getBookid().equals(removeId)) {
                books[i].removeBook();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ID " + removeId + " not found.");
        }

        // 6. Final display
        System.out.println("\n--- Updated Book Records ---");
        for (int i = 0; i < count; i++) {
            books[i].displayBookInfo();
        }

        sc.close();
    }
}
