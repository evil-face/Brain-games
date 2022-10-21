package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String choice = scanner.next();

        switch (choice) {
            case "1" -> Cli.showGreeting();
            case "2" -> Even.startEvenGame();
            case "3" -> Calc.startCalcGame();
            case "4" -> GCD.startGcdGame();
            case "5" -> Progression.startProgGame();
            case "6" -> Prime.startPrimeGame();
            default -> System.out.println("See you!");
        }
    }
}
