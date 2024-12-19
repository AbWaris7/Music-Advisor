import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Start by reading the user input
        String choice;

        // Loop to keep the application running until the user types "exit"
        while (true) {
            // Get the user's input
            choice = input.nextLine().trim(); // Use nextLine() to capture the entire line, trimming leading and trailing spaces.

            // Use switch-case to handle the different commands
            switch (choice) {
                case "new":
                    newReleased();
                    break;
                case "featured":
                    featured();
                    break;
                case "categories":
                    categories();
                    break;
                case "playlists Top Lists":
                    playListsTopLists();  // Add this case to handle "playlists Top Lists"
                    break;
                case "exit":
                    System.out.println("---GOODBYE!---");
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice!"); // For invalid input
            }
        }
    }

    // Simulate the response for new releases
    private static void newReleased() {
        System.out.println("---NEW RELEASES---");
        System.out.println("Mountains [Sia, Diplo, Labrinth]");
        System.out.println("Runaway [Lil Peep]");
        System.out.println("The Greatest Show [Panic! At The Disco]");
        System.out.println("All Out Life [Slipknot]");
    }

    // Simulate the response for featured playlists
    private static void featured() {
        System.out.println("---FEATURED---");
        System.out.println("Mellow Morning");
        System.out.println("Wake Up and Smell the Coffee");
        System.out.println("Monday Motivation");
        System.out.println("Songs to Sing in the Shower");
    }

    // Simulate the response for categories
    private static void categories() {
        System.out.println("---CATEGORIES---");
        System.out.println("Top Lists");
        System.out.println("Pop");
        System.out.println("Mood");
        System.out.println("Latin");
    }

    // Simulate the response for playlists in the "Top Lists" category
    private static void playListsTopLists() {
        System.out.println("---TOP LISTS PLAYLISTS---");
        System.out.println("Top 50 Global");
        System.out.println("Top 50 USA");
        System.out.println("Top 50 UK");
        System.out.println("Top 50 Canada");
    }

    // Simulate the response for playlists in the "Mood" category
    private static void playListsMood() {
        System.out.println("---MOOD PLAYLISTS---");
        System.out.println("Walk Like A Badass");
        System.out.println("Rage Beats");
        System.out.println("Arab Mood Booster");
        System.out.println("Sunday Stroll");
    }
}
