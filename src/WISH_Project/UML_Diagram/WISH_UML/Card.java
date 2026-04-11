 

public class Card {
    private int cardId;
    private String name;
    private int luxuryRating;
    private int bitcoins;
    private int points;

    // Constructor
    public Card(int cardId, String name, int luxuryRating, int bitcoins) {
        this.cardId = cardId;
        this.name = name;
        this.luxuryRating = luxuryRating;
        this.bitcoins = bitcoins;
        this.points = 0; // Points start at 0
    }

    // Accessors
    public int getCardId() {
        return cardId;
    }

    public int getLuxuryRating() {
        return luxuryRating;
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

    // Convert points to bitcoins
    public void convertPointsToBitcoins() {
        int convertibleBitcoins = points / 3;
        this.bitcoins += convertibleBitcoins;
        this.points %= 3; // Remaining points
    }

    // Update card after shuttle journey
    public void updateAfterShuttle() {
        this.deductBitcoins(4); // Deduct 4 bitcoins for the journey
        this.points += 1; // Add 1 point for the journey
    }

    // Check if enough bitcoins are available
    public boolean hasEnoughBitcoins(int required) {
        return this.bitcoins >= required;
    }

    // toString method
    @Override
    public String toString() {
        return "Card ID: " + cardId +
                ", Name: " + name +
                ", Luxury Rating: " + luxuryRating +
                ", Bitcoins: " + bitcoins +
                ", Points: " + points;
    }
}
