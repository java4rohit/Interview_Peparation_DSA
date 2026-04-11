 

import java.util.ArrayList;

public class World {

    private int referenceNumber;
    private String name;
    private int rating;
    private int capacity;
    private ArrayList<Card> cards;

    public World(int referenceNumber, String name, int luxuryRating, int capacity) {
        this.referenceNumber = referenceNumber;
        this.name = name;
        this.rating = luxuryRating;
        this.capacity = capacity;
        this.cards = new ArrayList<>();
    }

    public int getReferenceNumber() {
        return referenceNumber;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    // Method to check if the world is full
    public boolean isFull() {
        return cards.size() >= capacity;
    }

    // Mutator to add a Card to the world
    public boolean arrive(Card card) {
        if (!isFull()) {
            cards.add(card);
            return true; // Successfully added
        }
        return false; // World is full
    }

    // Mutator to remove a Card from the world
    public boolean leave(Card card) {
        return cards.remove(card); // Returns true if the card was found and removed
    }

    // Accessor to get details of a Card by ID
    public Card getCardById(int cardId) {
        for (Card card : cards) {
            if (card.getCardId() == cardId) {
                return card; // Return the card if found
            }
        }
        return null; // Card not found
    }

    // Accessor to check if a Card is on the world
    public boolean isCardOnWorld(Card card) {
        return cards.contains(card);
    }

    // Method to convert points to bitcoins for all cards in the world
    public void convertPointsToBitcoins() {
        for (Card card : cards) {
            card.convertPointsToBitcoins();
        }
    }

    // Check if a card exists on the world :whether a Card is on the world (in the ArrayList)
    public boolean hasCard(int cardId) {
        for (Card card : cards) {
            if (card.getCardId() == cardId) {
                return true;  // Card exists
            }
        }
        return false;  // Card does not exist
    }


    // toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("World Reference Number: ").append(referenceNumber)
                .append(", Name: ").append(name)
                .append(", Luxury Rating: ").append(rating)
                .append(", Capacity: ").append(capacity)
                .append(", Current Cards: ").append(cards.size()).append("\n");

        for (Card card : cards) {
            sb.append(card.toString()).append("\n");
        }
        return sb.toString();
    }
}
