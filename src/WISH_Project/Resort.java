package WISH_Project;

import java.util.ArrayList;
import java.util.HashMap;

public class Resort implements WISH {
    private String location;   // Location of the resort
    private ArrayList<Card> cards;  // List of all cards
    private ArrayList<World> worlds; // List of all worlds
    private HashMap<String, Shuttle> shuttles;  // Map of all shuttles

    // Constructor to set the resort location
    public Resort(String location) {
        this.location = location;
        this.cards = new ArrayList<>();
        this.worlds = new ArrayList<>();
        this.shuttles = new HashMap<>();

        loadWorlds();
        loadCards();
        setUpShuttles();
    }

    // Method to load the worlds
    private void loadWorlds() {
        // Creating worlds based on the reference number, name, luxury rating, and capacity
        World homeWorld = new World(0, "Home", 0, 1000);  // Home world
        World fantasia = new World(1, "Fantasia", 5, 2);
        World tropicana = new World(2, "Tropicana", 3, 10);
        World solo = new World(3, "Solo", 1, 1);
        World sprite = new World(4, "Sprite", 1, 100);
        
        worlds.add(homeWorld); // Always the first world is the "Home" world
        worlds.add(fantasia);
        worlds.add(tropicana);
        worlds.add(solo);
        worlds.add(sprite);
    }

    // Method to load the cards
    private void loadCards() {

        // Create cards and add them to the cards list
        Card card1 = new Card("1000", "Lynn", 5, 10);
        Card card2 = new Card("1001", "May", 3, 20);
        Card card3 = new Card("1002", "Nils", 10, 20);
        Card card4 = new Card("1003", "Olek", 2, 12);
        Card card5 = new Card("1004", "Pan", 3, 3);
        Card card6 = new Card("1005", "Quin", 1, 5);
        Card card7 = new Card("1006", "Raj", 10, 6);
        Card card8 = new Card("1007", "Sol", 7, 20);
        Card card9 = new Card("1008", "Tel", 6, 24);
        Card card10 = new Card("1009", "Zan", 9, 50);

        // Add all the cards to the collection
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card7);
        cards.add(card8);
        cards.add(card9);
        cards.add(card10);

        // Add all cards to the "Home" world initially
        for (Card card : cards) {
            worlds.get(0).arrive(card);  // Adding to Home world (index 0)
        }
    }

    // Method to set up shuttles between worlds
    private void setUpShuttles() {
        // Creating shuttles based on the worlds they connect
        Shuttle shuttle1 = new Shuttle("JKL8", worlds.get(0), worlds.get(1));  // Home -> Fantasia
        Shuttle shuttle2 = new Shuttle("EFG5", worlds.get(1), worlds.get(2));  // Fantasia -> Tropicana
        Shuttle shuttle3 = new Shuttle("CDE3", worlds.get(2), worlds.get(3));  // Tropicana -> Solo
        Shuttle shuttle4 = new Shuttle("DEF4", worlds.get(3), worlds.get(4));  // Solo -> Sprite
        Shuttle shuttle5 = new Shuttle("ABC1", worlds.get(4), worlds.get(0));  // Sprite -> Home
        
        // Adding shuttles to the map using journey codes as keys
        shuttles.put("JKL8", shuttle1);
        shuttles.put("EFG5", shuttle2);
        shuttles.put("CDE3", shuttle3);
        shuttles.put("DEF4", shuttle4);
        shuttles.put("ABC1", shuttle5);
    }

    // Implement the canTravel() method to check if a card can travel using a shuttle
    @Override
    public boolean canTravel(Card card, String journeyCode) {
        Shuttle shuttle = shuttles.get(journeyCode);
        if (shuttle == null) {
            System.out.println("Shuttle with journey code " + journeyCode + " does not exist.");
            return false;
        }
        return shuttle.canEnterShuttle(card); // Check if card meets travel conditions
    }

    // Implement the travel() method to process the movement of the card between worlds
    @Override
    public String travel(Card card, String journeyCode) {
        Shuttle shuttle = shuttles.get(journeyCode);
        if (shuttle == null) {
            return "Shuttle with journey code " + journeyCode + " does not exist.";
        }
        return shuttle.processCardMovement(card); // Process the movement and return the message
    }

    // Helpful method to find a world by its reference number
    protected World findWorldByReference(int referenceNumber) {
        for (World world : worlds) {
            if (world.getReferenceNumber() == referenceNumber) {
                return world;
            }
        }
        return null;
    }

    // Helpful method to find a shuttle by its journey code
    private Shuttle findShuttleByCode(String journeyCode) {
        return shuttles.get(journeyCode);
    }

    // Helpful method to find a card by its ID
    public Card findCardById(String cardId) {
        for (Card card : cards) {
            if (card.getCardId().equalsIgnoreCase(cardId)) {
                return card;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Resort Location: ").append(location).append("\n")
                .append("Worlds: ").append(worlds.size()).append("\n")
                .append("Shuttles: ").append(shuttles.size()).append("\n")
                .append("Cards: ").append(cards.size()).append("\n");
        return sb.toString();
    }
}
