package hexlet.code;

import java.util.Scanner;

public class Cli {

    // a method to greet user with typed in name
    public static void showGreeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String username = scanner.next();
        System.out.println("Hello, " + username + "!");
    }

}
