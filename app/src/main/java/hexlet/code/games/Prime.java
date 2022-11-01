package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Prime {

    // game task
    private static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    // main method to run the game
    public static void startPrimeGame() {
        String[] primeQuestions = new String[Engine.ROUNDS];
        String[] primeAnswers = new String[Engine.ROUNDS];

        // generate questions and answers array
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randNumber = RandomUtils.getRandomNumber(Engine.RANGE);
            primeQuestions[i] = String.valueOf(randNumber);
            primeAnswers[i] = isPrime(randNumber) ? "yes" : "no";
        }

        // call the engine with game parameters
        Engine.runGame(TASK, primeQuestions, primeAnswers);
    }

    // a method to check if a number is prime
    private static boolean isPrime(int a) {
        int i = 2;
        boolean hasMoreThanTwoDividers = false;

        // check if a == 0 or a == 1, otherwise run an algorithm
        if (a <= 1) {
            return false;
        }
        while ((i * i <= a) && !hasMoreThanTwoDividers) {
            if (a % i == 0) {
                hasMoreThanTwoDividers = true;
            }
            i++;
        }

        return !hasMoreThanTwoDividers;
    }
}

