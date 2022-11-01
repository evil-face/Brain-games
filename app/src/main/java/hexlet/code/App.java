package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.io.IOException;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        try {
            String choice = scanner.next();
            if (!StringUtils.isNumeric(choice)) {
                throw new IOException();
            }
            switch (choice) {
                case "1" -> Cli.showGreeting();
                case "2" -> Even.startEvenGame();
                case "3" -> Calculator.startCalcGame();
                case "4" -> GCD.startGcdGame();
                case "5" -> Progression.startProgGame();
                case "6" -> Prime.startPrimeGame();
                case "0" -> System.out.println("Goodbye!");
                default -> throw new IOException();
            }
        } catch (IOException e) {
            System.out.println("Please enter a valid number next time!");
        }
    }
}

