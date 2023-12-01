import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BasketballStats playerStats = new BasketballStats();
        System.out.println("Basketball Stat Tracking App");
        while (true) {
            System.out.println("\n1. Record Points");
            System.out.println("2. Record Rebounds");
            System.out.println("3. Record Assists");
            System.out.println("4. Display Stats");
            System.out.println("5. Exit");
            System.out.println("6. Enter Player Name");
            System.out.println("7. Display Jersey Number");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter points scored: ");
                int points = scanner.nextInt();
                playerStats.recordPoints(points);
            } else if (choice == 2) {
                System.out.print("Enter rebounds: ");
                int rebounds = scanner.nextInt();
                playerStats.recordRebounds(rebounds);
            } else if (choice == 3) {
                System.out.print("Enter assists: ");
                int assists = scanner.nextInt();
                playerStats.recordAssists(assists);
            } else if (choice == 4) {
                playerStats.displayStats();
            } else if (choice == 5) {
                System.out.println("Exiting the app. Goodbye!");
                System.exit(0);
            } else if (choice == 6) {
                System.out.print("Enter name: ");
                scanner.nextLine();  // Consume the '\n' character
                String name = scanner.nextLine();
                playerStats.recordName(name);
            } else if (choice == 7) {
                playerStats.JerseyNumber();  // Display Jersey Number
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
