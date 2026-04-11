package WISH_Project;

/**
 * The BusinessCard class represents a business card with a luxury rating, 30 bitcoins, and 10 free drinks.
 * Every time a shuttle journey is made, 1 free drink is deducted, until there are no free drinks left.
 * The toString() method is overridden to include the remaining free drinks.
 */
public class BusinessCard extends Card {
    private int freeDrinks;  // Number of free drinks available

    // Constructor
    public BusinessCard(String cardId, String name, int luxuryRating) {
        super(cardId, name, luxuryRating, 30);  // 30 bitcoins for business card
        this.freeDrinks = 10;  // 10 free drinks initially
    }

    public int getFreeDrinks() {
        return freeDrinks;
    }

    @Override
    public void updateAfterShuttle() {
        if (freeDrinks > 0) {
            freeDrinks--;

        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Free Drinks Remaining: " + freeDrinks;
    }
}
