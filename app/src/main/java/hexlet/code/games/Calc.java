package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {

    // number of different math operations used in game
    private static final int TYPE = 3;
    private static String[] questions = new String[Engine.ROUNDS];
    private static String[] answers = new String[Engine.ROUNDS];

    // main method to run the game
    public static void startCalcGame() {
        String task = "What is the result of the expression?";

        // generate questions and answers array
        for (int i = 0; i < Engine.ROUNDS; i++) {
            getRandomQuestionAndAnswer(i);
        }

        // call the engine with game parameters
        Engine.runGame(task, questions, answers);
    }

    // randomly pick math operation and generate question and answer
    private static void getRandomQuestionAndAnswer(int questionNum) {
        Random rand = new Random();
        int firstRandNumber = rand.nextInt(Engine.RANGE);
        int secondRandNumber = rand.nextInt(Engine.RANGE);
        int type = rand.nextInt(TYPE);

        switch (type) {
            case 0:
                questions[questionNum] = firstRandNumber + " + " + secondRandNumber;
                answers[questionNum] = String.valueOf(firstRandNumber + secondRandNumber);
                break;
            case 1:
                questions[questionNum] = firstRandNumber + " - " + secondRandNumber;
                answers[questionNum] = String.valueOf(firstRandNumber - secondRandNumber);
                break;
            default:
                questions[questionNum] = firstRandNumber + " * " + secondRandNumber;
                answers[questionNum] = String.valueOf(firstRandNumber * secondRandNumber);
                break;
        }
    }
}
