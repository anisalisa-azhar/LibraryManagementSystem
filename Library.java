import java.util.ArrayList;

class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void borrowedBook(User user, String title) {
        System.out.println("User: " + user.getName() + ", Borrowed: " + title);
    }

    public void listAvailableBooks() {
        for (Book book:books){
            book.printBookInfo();
        }
    }
   

    

}
