package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {

    // main method to run the game
    public static void startCalcGame() {
        Random rand = new Random();
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        String task = "What is the result of the expression?";

        // generate questions and answers array
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstRandNumber = rand.nextInt(100);
            int secondRandNumber = rand.nextInt(100);
            int type = rand.nextInt(3);

            switch (type) {
                case 0:
                    questions[i] = firstRandNumber + " + " + secondRandNumber;
                    answers[i] = String.valueOf(firstRandNumber + secondRandNumber);
                    break;
                case 1:
                    questions[i] = firstRandNumber + " - " + secondRandNumber;
                    answers[i] = String.valueOf(firstRandNumber - secondRandNumber);
                    break;
                default:
                    questions[i] = firstRandNumber + " * " + secondRandNumber;
                    answers[i] = String.valueOf(firstRandNumber * secondRandNumber);
                    break;
            }
        }

        // call the engine with game parameters
        Engine.runGame(task, questions, answers);
    }
}
