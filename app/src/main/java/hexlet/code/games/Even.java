package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void runGame() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String name = Engine.getName();
        int numOfRightAnswers = 0;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (numOfRightAnswers < 3) {
            int randNumber = rand.nextInt(100);
            boolean isEven = randNumber % 2 == 0;
            String correctAnswer = (randNumber % 2 == 0) ? "yes" : "no";

            System.out.println("Question: " + randNumber);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            boolean isEvenUserAnswer = userAnswer.equals("yes");

            if (isEvenUserAnswer == isEven) {
                System.out.println("Correct!");
                numOfRightAnswers++;
            } else {
                System.out.print("'" + userAnswer + "'" + " is wrong answer ;(. ");
                System.out.println("Correct answer was " + "'" + correctAnswer + "'");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!\n");
    }
}
