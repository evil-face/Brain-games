package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Calculator {

    // number of different math operations used in game
    private static final int COUNT_OF_MATH_OPERANDS = 3;

    private static final String[] TYPES_OF_MATH_OPERANDS = {" + ", " - ", " * "};

    // game task
    private static final String TASK = "What is the result of the expression?";

    // main method to run the game
    public static void startCalcGame() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        // generate questions and answers array
        try {
            for (int i = 0; i < Engine.ROUNDS; i++) {
                String[] currentPair = getRandomQuestionAndAnswer();
                questions[i] = currentPair[0];
                answers[i] = currentPair[1];
            }
        } catch (RuntimeException e) {
            System.out.println("Unknown math operation");
            return;
        }

        // call the engine with game parameters
        Engine.runGame(TASK, questions, answers);
    }

    // randomly pick math operation and generate question and answer
    private static String[] getRandomQuestionAndAnswer() throws RuntimeException {
        int firstRandNumber = RandomUtils.getRandomNumber(Engine.RANGE);
        int secondRandNumber = RandomUtils.getRandomNumber(Engine.RANGE);
        int selectedRandomOperand = RandomUtils.getRandomNumber(COUNT_OF_MATH_OPERANDS);
        int answerValue;
        String[] currentPair = new String[2];

        String mathOperand = TYPES_OF_MATH_OPERANDS[selectedRandomOperand];
        currentPair[0] = firstRandNumber + mathOperand + secondRandNumber;

        switch (mathOperand.trim()) {
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
                throw new RuntimeException();
        }

        currentPair[1] = String.valueOf(answerValue);

        return currentPair;
    }
}
