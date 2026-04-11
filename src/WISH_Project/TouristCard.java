package WISH_Project;

/**
 * The TouristCard class represents a tourist card with a specified luxury rating, a number of bitcoins,
 * and citizenship information (planet they come from). The toString() method is overridden to include the citizenship.
 */
public class TouristCard extends Card {
    private String citizenship;  // The planet the tourist comes from

    // Constructor
    public TouristCard(String cardId, String name, int luxuryRating, int bitcoins, String citizenship) {
        super(cardId, name, luxuryRating, bitcoins);
        this.citizenship = citizenship;
    }

    public String getCitizenship() {
        return citizenship;
    }

    @Override
    public String toString() {
        return super.toString() + ", Citizenship: " + citizenship;
    }
}
