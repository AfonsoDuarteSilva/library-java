
import java.time.LocalDate;
/**
 * Represents a loan of a given book and user
 */
public class Loan {
    private final Book requestedBook;
    private final User requestUser;
    private final LocalDate loanDate;
    private final LocalDate dueDate;

    /**
     * Creates a new loan for the given book and user.
     * The due date is automatically set to 14 days from the loan date.
     * @param requestedBook the book being loaned
     * @param requestUser the user requesting the book
     * @param loanDate the date the loan was made
     */
    public Loan(Book requestedBook, User requestUser, LocalDate loanDate) {
        this.requestedBook = requestedBook;
        this.requestUser = requestUser;
        this.loanDate = loanDate;
        this.dueDate = loanDate.plusDays(14);
    }

    /**
     * Returns the requested book
     * @return book that has been requested 
     */
    public Book getRequestedBook() {
        return this.requestedBook;
    }

    /**
     * Returns the user that requested the book
     * @return user that made a request
     */
    public User getRequestUser() {
        return this.requestUser;
    }

    /**
     * Returns the date the loan was made
     * @return the date the loan was made
     */
    public LocalDate getLoanDate() {
        return this.loanDate;
    }

    /**
     * Returns the date to return the requested book
     * @return date to return the book
     */
    public LocalDate getDueDate() {
        return this.dueDate;
    }
}