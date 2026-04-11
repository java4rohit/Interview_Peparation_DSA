package WISH_Project;

public class Shuttle {

    private String journeyCode;
    private World fromWorld;
    private World toWorld;

    public Shuttle(String journeyCode, World fromWorld, World toWorld) {
        this.journeyCode = journeyCode;
        this.fromWorld = fromWorld;
        this.toWorld = toWorld;
    }

    // Accessors
    public String getJourneyCode() {
        return journeyCode;
    }

    public World getFromWorld() {
        return fromWorld;
    }

    public World getToWorld() {
        return toWorld;
    }


    public boolean canEnterShuttle(Card card) {
        if (card.getRating() < toWorld.getRating()) {
            return false;
        }
        if (toWorld.isFull()) {
            return false;
        }
        if (!card.hasEnoughBitcoins(4)) {
            return false;
        }
        if (!fromWorld.hasCard(card.getCardId())) {
            return false;
        }
        return true;
    }

    public String processCardMovement(Card card) {
        if (canEnterShuttle(card)) {
            fromWorld.leave(card);   // Remove from source world
            toWorld.arrive(card);   // Add to destination world
            card.updateAfterShuttle();  // Update card details
            return "Card ID " + card.getCardId() + " successfully traveled from " +
                    fromWorld.getName() + " to " + toWorld.getName() + ".";
        } else {
            if (card.getRating() < toWorld.getRating()) {
                return "Travel failed: Luxury rating too low.";
            }
            if (toWorld.isFull()) {
                return "Travel failed: Destination world is full.";
            }
            if (!card.hasEnoughBitcoins(4)) {
                return "Travel failed: Not enough bitcoins.";
            }
            if (!fromWorld.hasCard(card.getCardId())) {
                return "Travel failed: Card not on source world.";
            }
            return "Travel failed: Unknown reason.";
        }
    }

    @Override
    public String toString() {
        return "Shuttle Journey Code: " + journeyCode +
                ", From: " + fromWorld.getName() +
                ", To: " + toWorld.getName();
    }
}
