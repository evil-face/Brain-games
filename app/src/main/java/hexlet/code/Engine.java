package hexlet.code;

import java.util.Scanner;
public class Engine {
    public static final int ROUNDS = 3;
    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static void runGame(String task, String[] questions, String[] answers) {
        String name = getName();
        System.out.println(task);

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

