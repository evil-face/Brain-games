package hexlet.code;

import hexlet.code.games.Even;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> Cli.showGreeting();
            case 2 -> Even.runGame();
            default -> System.out.println("See you!");
        }
    }
}
