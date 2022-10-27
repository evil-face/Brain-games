package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {

    // main method to run the game
    public static void startGcdGame() {
        Random rand = new Random();
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        String task = "Find the greatest common divisor of given numbers.";

        // generate questions and answers array
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstRandNumber = rand.nextInt(Engine.RANGE);
            int secondRandNumber = rand.nextInt(Engine.RANGE);
            questions[i] = firstRandNumber + " " + secondRandNumber;
            answers[i] = String.valueOf(getGcd(firstRandNumber, secondRandNumber));
        }

        // call the engine with game parameters
        Engine.runGame(task, questions, answers);
    }

    // a method to find the greatest common divisor
    private static int getGcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : getGcd(b, a % b);
    }
}
