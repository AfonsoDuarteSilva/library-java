/**
 * Represents a user
 */
public class User {
    private final String name;
    private String email;
    private final String card;

    /**
     * 
     */
    public User (String name, String email, String card) {
        this.name = name;
        this.email = email;
        this.card = card;
    }

    /**
     * 
     */
    public String getName() {
        return this.name;
    }

    /**
     * 
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * 
     */
    public String getCard() {
        return this.card;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}