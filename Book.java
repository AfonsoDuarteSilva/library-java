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
    public Book (String title, String author, String ISBN, String genre) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
        available = true;

    }

    /**
     * Returns the title of the book
     * @return title of the book
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Returns the author of the book
     * @return author of the book
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Returns the book unique id
     * @return ISBN of the book
     */
    public String getISBN() {
        return this.ISBN;
    }

    /**
     * Returns the book genre
     * @return genre of the book
     */
    public String getGenre() {
        return this.genre;
    }

    /**
     * Returns wether or not the book is available for borrowing
     * @return True if the book is available for borrowing, False otherwise
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