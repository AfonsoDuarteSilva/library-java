public class Book {
    private String title;
    private String author;
    private String ISBN;
    private String category;
    private boolean available;

    /**
     * 
     */
    public Book (String title, String author, String ISBN, String category) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.category = category;
        available = true;

    }

    public String getTitle() {
        return this.title;
    }
    
}