package WISH_Project;

public class MyTester {

    public static void main(String[] args) {

        // Polymorphic creation: WISH is the interface, Resort is the concrete class that implements WISH
        WISH resort = new Resort("Wayward Worlds");

        // Run the test cases
        doTest(resort);
    }

    // Method to perform the tests
    private static void doTest(WISH resort) {

        // Test 1: Check if a card can travel on an available shuttle
        System.out.println("Test 1: Can Card 1000 travel on Shuttle JKL8?");
        Card card1 = new Card("1000", "Lynn", 5, 10);
        World homeWorld = new World(0, "Home", 0, 1000);
        World fantasiaWorld = new World(1, "Fantasia", 5, 2);
        homeWorld.arrive(card1);
        
        //Try to travel on a valid shuttle
        boolean canTravel = resort.canTravel(card1, "JKL8");
        System.out.println("Can Card 1000 travel on Shuttle JKL8? " + canTravel);
        System.out.println();

        //Test 2: Attempting to travel without enough bitcoins
        System.out.println("Test 2: Can Card 1001 travel on Shuttle JKL8 without enough bitcoins?");
        Card card2 = new Card("1001", "May", 3, 2); // Card with insufficient bitcoins
        homeWorld.arrive(card2);
        
        // Try to travel with insufficient bitcoins
        canTravel = resort.canTravel(card2, "JKL8");
        System.out.println("Can Card 1001 travel on Shuttle JKL8? " + canTravel);
        System.out.println();

        // Test 3: Check if travel happens successfully when the card can travel
        System.out.println("Test 3: Travel Card 1000 from Home to Fantasia");
        String travelResult = resort.travel(card1, "JKL8"); // Card should be able to travel
        System.out.println(travelResult);
        System.out.println();

        // Test 4: Check invalid shuttle code
        System.out.println("Test 4: Attempt to travel using an invalid shuttle code");
        travelResult = resort.travel(card1, "XYZ123"); // Invalid shuttle code
        System.out.println(travelResult);
        System.out.println();

        // Test 5: Show resort status after some travel
        System.out.println("Test 5: Resort status after some travel");
        System.out.println(resort); // Display the resort status after travel
        System.out.println();

        // Test 6: Test if a card is on a world after a travel attempt
        System.out.println("Test 6: Is Card 1000 still on Home World?");
        boolean isOnWorld = homeWorld.hasCard(card1.getCardId());
        System.out.println("Is Card 1000 still on Home World? " + isOnWorld);
        
        // Check if card is now on Fantasia world
        World fantasia =  ((Resort) resort).findWorldByReference(1); // FantasiafindWorldByReference
        isOnWorld = fantasia.hasCard(card1.getCardId());
        System.out.println("Is Card 1000 on Fantasia World? " + isOnWorld);

    }
}
