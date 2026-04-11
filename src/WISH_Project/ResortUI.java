package WISH_Project;

import java.util.Scanner;

public class ResortUI {

    public static Resort resort;

    public static void main(String[] args) {
        // Initialize the resort with a location
          resort = new Resort("Wayward Worlds");
        // Load the worlds, cards, and shuttles

        // Start the menu-driven user interface
        startMenu();
    }

    // Method to display the main menu and get user input
    public static void startMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display the main menu
            System.out.println("\nWelcome to the Resort Management System");
            System.out.println("1. Can Travel");
            System.out.println("2. Travel");
            System.out.println("3. Show Resort Status");
            System.out.println("4. Exit");

            // Get the user input
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left by nextInt()

            switch (choice) {
                case 1:
                    checkCanTravel(scanner);
                    break;
                case 2:
                    initiateTravel(scanner);
                    break;
                case 3:
                    showResortStatus();
                    break;
                case 4:
                    System.out.println("Exiting the Resort Management System. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to check if a card can travel using a specific shuttle
    private static void checkCanTravel(Scanner scanner) {
        System.out.print("Enter Card ID: ");
        String cardId = scanner.nextLine();
        scanner.nextLine();  // Consume newline left by nextInt()

        System.out.print("Enter Shuttle Journey Code: ");
        String journeyCode = scanner.nextLine();

        // Retrieve the card by ID and check if it can travel using the shuttle
        Card card = resort.findCardById(cardId);
        if (card != null) {
            boolean canTravel = resort.canTravel(card, journeyCode);
            if (canTravel) {
                System.out.println("The card can travel using the shuttle.");
            } else {
                System.out.println("The card cannot travel using the shuttle.");
            }
        } else {
            System.out.println("Card not found.");
        }
    }

    // Method to initiate the travel of a card using a shuttle
    private static void initiateTravel(Scanner scanner) {

        System.out.print("Enter Card ID: ");
        String cardId = scanner.nextLine();
        scanner.nextLine();  // Consume newline left by nextInt()

        System.out.print("Enter Shuttle Journey Code: ");
        String journeyCode = scanner.nextLine();

        // Retrieve the card by ID and attempt to travel
        Card card = resort.findCardById(cardId);
        if (card != null) {
            String result = resort.travel(card, journeyCode);
            System.out.println(result);
        } else {
            System.out.println("Card not found.");
        }
    }

    // Method to display the current status of the resort
    private static void showResortStatus() {
        System.out.println("\nResort Status:");
        System.out.println(resort);  // Calls the Resort's toString() method
    }
}
