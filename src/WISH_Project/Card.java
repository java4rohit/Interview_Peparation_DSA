package WISH_Project;

public class Card {

    private String cardId;
    private String name;
    private int rating;
    private int bitcoins;
    private int points;

    // Constructor
    public Card(String cardId, String name, int rating, int bitcoins) {
        this.cardId = cardId;
        this.name = name;
        this.rating = rating;
        this.bitcoins = bitcoins;
        this.points = 0; // Points start at 0
    }

    public String getCardId() {
        return cardId;
    }

    public int getRating() {
        return rating;
    }

    public int getBitcoins() {
        return bitcoins;
    }

    // Add bitcoins
    public void addBitcoins(int amount) {
        this.bitcoins += amount;
    }

    // Deduct bitcoins
    public boolean deductBitcoins(int amount) {
        if (this.bitcoins >= amount) {
            this.bitcoins -= amount;
            return true;
        }
        return false; // Not enough bitcoins
    }

    // : method to update the card after taking a shuttle
    public void updateAfterShuttle() {
        this.deductBitcoins(4); // Deduct 4 bitcoins for the journey
        this.points += 1; // Add 1 point for the journey
    }

    // Check if enough bitcoins are available
    public boolean hasEnoughBitcoins(int required) {
        return this.bitcoins >= required;
    }

    // Convert points to bitcoins
    public void convertPointsToBitcoins() {
        int convertibleBitcoins = points / 3;
        this.bitcoins += convertibleBitcoins;
        this.points %= 3; // Remaining points
    }

    // toString method
    @Override
    public String toString() {
        return "Card ID: " + cardId +
                ", Name: " + name +
                ", Luxury Rating: " + rating +
                ", Bitcoins: " + bitcoins +
                ", Points: " + points;
    }
}
