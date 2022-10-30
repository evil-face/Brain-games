package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Calculate {

    // number of different math operations used in game
    private static final int TYPE = 3;

    // game task
    private static final String TASK = "What is the result of the expression?";

    // main method to run the game
    public static void startCalcGame() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        // generate questions and answers array
        for (int i = 0; i < Engine.ROUNDS; i++) {
            String[] currentPair = getRandomQuestionAndAnswer();
            questions[i] = currentPair[0];
            answers[i] = currentPair[1];
        }

        // call the engine with game parameters
        Engine.runGame(TASK, questions, answers);
    }

    // randomly pick math operation and generate question and answer
    private static String[] getRandomQuestionAndAnswer() {
        int firstRandNumber = RandomUtils.getRandomNumber(Engine.RANGE);
        int secondRandNumber = RandomUtils.getRandomNumber(Engine.RANGE);
        int typeOfMathOperator = RandomUtils.getRandomNumber(TYPE);
        int answerValue = 0;
        String mathOperator = getStringMathOperator(typeOfMathOperator);
        String[] currentPair = new String[2];

        currentPair[0] = firstRandNumber + mathOperator + secondRandNumber;
        switch (mathOperator.trim()) {
            case "+":
                answerValue = firstRandNumber + secondRandNumber;
                break;
            case "-":
                answerValue = firstRandNumber - secondRandNumber;
                break;
            case "*":
                answerValue = firstRandNumber * secondRandNumber;
                break;
            default:
                //todo throw exception
        }
        currentPair[1] = String.valueOf(answerValue);

        return currentPair;
    }

    private static String getStringMathOperator(int type) {
        String operator = "";
        switch (type) {
            case 0 -> operator = " + ";
            case 1 -> operator = " - ";
            case 2 -> operator = " * ";
            default -> {
            }
        }
        return operator;
    }
}
