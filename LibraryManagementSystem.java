public class LibraryManagementSystem {

    public static void main(String[] args) {
        // Create a library instance
        Library library = new Library();
        

        // Add books to the library
        library.addBook(new Book("Harry Potter", "J.K. Rowling", "12345"));
        library.addBook(new Book("Lord of the Rings", "J.R.R. Tolkien", "67890"));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "11112"));

        // Create users
        User first = new User("Alice", 25);
        User second = new User("Bob", 30);

        // Add users to the library
        library.addUser(first);
        library.addUser(second);

        // List available books
        System.out.println("--- Available Books ---");
        library.listAvailableBooks();

        // Borrow books
        System.out.println("--- Borrowed Books ---");
        library.borrowedBook(first, "Harry Potter");
        library.borrowedBook(second, "Lord of the Rings");

        //overdue books
        System.out.println("--- Overdue Books ---");
        first.borrowBook("Harry Potter");
        second.borrowBook("Lord of the Rings");
    }
}
