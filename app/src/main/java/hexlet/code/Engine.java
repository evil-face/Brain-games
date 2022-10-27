package hexlet.code;

import java.util.Scanner;
public class Engine {

    // number of rounds to play before we announce win
    public static final int ROUNDS = 3;

    // biggest generated random number used in games
    public static final int RANGE = 100;

    // a method to greet user with typed in name
    private static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }


    // a method to print game text with any received parameters
    public static void runGame(String task, String[] questions, String[] answers) {

        // get user name from a console
        String name = getName();
        System.out.println(task);

        // a method to print game info and compare user's answers
        for (int i = 0; i < ROUNDS; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + userAnswer + "'" + " is wrong answer ;(. ");
                System.out.println("Correct answer was " + "'" + answers[i] + "'");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!\n");
    }
}

