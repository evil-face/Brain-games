package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    public static void startGcdGame() {
        Random rand = new Random();
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        String task = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstRandNumber = rand.nextInt(100);
            int secondRandNumber = rand.nextInt(100);
            questions[i] = firstRandNumber + " " + secondRandNumber;
            answers[i] = String.valueOf(getGcd(firstRandNumber, secondRandNumber));
        }

        Engine.runGame(task, questions, answers);
    }

    public static int getGcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : getGcd(b, a % b);
    }
}
