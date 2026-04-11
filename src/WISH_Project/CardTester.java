package WISH_Project;

// CardTester.java
public class CardTester {
    public static void main(String[] args) {

        Card card1 = new Card("1000", "Lynn", 5, 10);
        Card card2 = new Card("1001", "May", 3, 20);

        System.out.println("Initial Card Details:");
        System.out.println(card1);
        System.out.println(card2);
        System.out.println();

        // Add bitcoins
        System.out.println("Testing addBitcoins:");
        card1.addBitcoins(5);
        System.out.println("After adding 5 bitcoins: " + card1);
        System.out.println();

        // Deduct bitcoins
        System.out.println("Testing deductBitcoins:");
        boolean success = card1.deductBitcoins(8);
        System.out.println("Deducting 8 bitcoins success: " + success);
        System.out.println(card1);
        System.out.println();

        // Convert points to bitcoins
        System.out.println("Testing convertPointsToBitcoins:");
        card1.updateAfterShuttle(); // Adding a journey to generate points
        card1.updateAfterShuttle(); // Adding another journey to generate more points
        System.out.println("Before converting points: " + card1);
        card1.convertPointsToBitcoins();
        System.out.println("After converting points to bitcoins: " + card1);
        System.out.println();

        // Update after shuttle journey
        System.out.println("Testing updateAfterShuttle:");
        card2.updateAfterShuttle();
        System.out.println("After one shuttle journey: " + card2);
        System.out.println();

        // Check if enough bitcoins
        System.out.println("Testing hasEnoughBitcoins:");
        System.out.println("Card 1 has enough bitcoins for 4 (expected true): " + card1.hasEnoughBitcoins(4));
        System.out.println("Card 2 has enough bitcoins for 25 (expected false): " + card2.hasEnoughBitcoins(25));
    }
}
