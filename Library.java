import java.time.LocalDate;
import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;
    private ArrayList<Loan> booksOnLoan;

    /**
     * Creates a new library
     */
    public Library () {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.booksOnLoan = new ArrayList<>();
    }

    /**
     * Adds a book to the library
     * @param book book to add
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Adds a user to the library
     * @param user user to add
     */
    public void addUser(User user) {
        users.add(user);
    }

    /**
     * Borrows a book that the user asked
     * @param user that requested the loan 
     * @param book book that the user requested
     */
    public void borrowBook(User user, Book book) {
        if (book.isAvailable()) {
            Loan bookOnLoan = new Loan(book, user, LocalDate.now());
            booksOnLoan.add(bookOnLoan);
            book.setAvailable(false);
        } else {
            throw new IllegalArgumentException("Book is not available to borrow");
        }
    }

    /**
     * Returns a book on loan to the library
     * @param user user that returned the book
     * @param book book that was returned
     * @requires {@code !book.isAvailable()}
     */
    public void returnBook(Book book) {
        booksOnLoan.remove(searchLoan(book));
        book.setAvailable(true);
    }

    /**
     * Search for the book on the list of books on loan
     */
    public Loan searchLoan(Book book) {
        for(Loan loan : booksOnLoan) {
            if(loan.getRequestedBook().equals(book)) {
                return loan;
            } 
        }
        throw new IllegalArgumentException("Book not found");
    }
}