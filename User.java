import java.util.ArrayList;
import java.util.Map;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User {
    private String name;
    private int age;
    private ArrayList<String> borrowedBooks;
    //private Map<String, LocalDate> borrowedBooksDueDates;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void borrowBook(String bookTitle) {
        borrowedBooks.add(bookTitle);
        LocalDate dueDate = LocalDate.now().plusDays(14);
        //borrowedBooksDueDates.put(bookTitle, dueDate);
        System.out.println("User: " + getName() + ", Book borrowed: " + bookTitle + ", Due date: " + dueDate.format(DateTimeFormatter.ofPattern("MMM dd, yyyy")));
    }

    public void returnBook(String bookTitle) {
        if (borrowedBooks.remove(bookTitle)) {
            //borrowedBooksDueDates.remove(bookTitle);
            System.out.println(bookTitle + " returned successfully.");
        } else {
            System.out.println("Error: " + bookTitle + " not found in borrowed books.");
        }
    }

    public void printBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("No borrowed books.");
        } else {
            System.out.println("Borrowed books: " + borrowedBooks);
        }
    }
}
