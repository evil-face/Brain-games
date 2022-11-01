package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Even {

    // game task
    private static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    // main method to run the game
    public static void startEvenGame() {
        String[] evenAnswers = new String[Engine.ROUNDS];
        String[] evenQuestions = new String[Engine.ROUNDS];

        // generate questions and answers array
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randNumber = RandomUtils.getRandomNumber(Engine.RANGE);
            evenQuestions[i] = String.valueOf(randNumber);
            evenAnswers[i] = isEven(randNumber) ? "yes" : "no";
        }

        // call the engine with game parameters
        Engine.runGame(TASK, evenQuestions, evenAnswers);
    }

    // checking if number is even or not
    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
