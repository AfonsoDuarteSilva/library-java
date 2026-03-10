import java.time.LocalDate;
import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;
    private ArrayList<Loan> onLoanBooks;

    /**
     * Creates a new library
     */
    public Library () {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.onLoanBooks = new ArrayList<>();
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
     * @param user that asked to borrow the book
     * @param book book  that the user asked to borrow
     */
    public void borrowBook(User user, Book book) {
        if (book.isAvailable()) {
            Loan bookOnLoan = new Loan(book, user, LocalDate.now());
            onLoanBooks.add(bookOnLoan);
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
    public void returnBook(User user, Book book) {
        onLoanBooks.remove(searchLoan(book));
        book.setAvailable(true);
    }

    public Loan searchLoan(Book book) {
        for(Loan loan : onLoanBooks) {
            if(loan.getRequestedBook().equals(book)) {
                return loan;
            } 
        }
        throw new IllegalArgumentException("Book not found");
    }
}