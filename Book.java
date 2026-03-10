/**
 * Represents a book 
 */
public class Book {
    private final String title;
    private final String author;
    private final String ISBN;
    private final String genre;
    private boolean available;

    /**
     * Creates a new book with the given information
     * @param title the book´s title
     * @param author the book´s author
     * @param ISBN the book´s unique id
     * @param genre the book´s genre
     */
    public Book (String title, String author, String ISBN, String category) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.genre = category;
        available = true;

    }

    /**
     * Gives the title of the book
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Gives the author of the book
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Gives the book unique id
     */
    public String getISBN() {
        return this.ISBN;
    }

    /**
     * Gives the book genre
     */
    public String getGenre() {
        return this.genre;
    }

    /**
     * Tell´s wether or not the book is available for borrowing
     */
    public boolean isAvailable() {
        return this.available;
    }

    /**
     * Sets the book availability
     * @param available whether the book is available for borrowing
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }
}