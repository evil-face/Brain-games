package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {

    // main method to run the game
    public static void startPrimeGame() {
        Random rand = new Random();
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        // generate questions and answers array
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randNumber = rand.nextInt(Engine.RANGE);
            questions[i] = String.valueOf(randNumber);
            answers[i] = isPrime(randNumber) ? "yes" : "no";
        }

        // call the engine with game parameters
        Engine.runGame(task, questions, answers);
    }

    // a method to check if a number is prime
    public static boolean isPrime(int a) {
        int i = 2;
        boolean hasMoreThanTwoDividers = false;

        // check if a == 0 or a == 1, otherwise run an algorithm
        if (a <= 1) {
            return false;
        } else {
            while ((i * i <= a) && !hasMoreThanTwoDividers) {
                if (a % i == 0) {
                    hasMoreThanTwoDividers = true;
                }
                i++;
            }
        }

        return !hasMoreThanTwoDividers;
    }
}

