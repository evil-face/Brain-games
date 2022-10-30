package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class GCD {

    // game task
    private static final String TASK = "Find the greatest common divisor of given numbers.";
    // main method to run the game
    public static void startGcdGame() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];

        // generate questions and answers array
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstRandNumber = RandomUtils.getRandomNumber(Engine.RANGE);
            int secondRandNumber = RandomUtils.getRandomNumber(Engine.RANGE);
            questions[i] = firstRandNumber + " " + secondRandNumber;
            answers[i] = String.valueOf(getGcd(firstRandNumber, secondRandNumber));
        }

        // call the engine with game parameters
        Engine.runGame(TASK, questions, answers);
    }

    // a method to find the greatest common divisor
    private static int getGcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : getGcd(b, a % b);
    }
}
