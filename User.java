/**
 * Represents a library user
 */
public class User {
    private String name;
    private String email;
    private final String card;

    /**
     * Creates a user with the given information
     * @param name user name
     * @param email user email
     * @param card user library card
     */
    public User(String name, String email, String card) {
        this.name = name;
        this.email = email;
        this.card = card;
    }

    /**
     * Returns the name of the user
     * @return user´s name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the user email
     * @return user´s email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Returns the user card
     * @return user´s card
     */
    public String getCard() {
        return this.card;
    }

    /**
     * Sets the name of the user
     * @param name user´s name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the email of the user
     * @param email user´s email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}