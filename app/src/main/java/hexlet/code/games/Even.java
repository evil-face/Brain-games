package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Even {

    // game task
    private static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    // main method to run the game
    public static void startEvenGame() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];

        // generate questions and answers array
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randNumber = RandomUtils.getRandomNumber(Engine.RANGE);
            questions[i] = String.valueOf(randNumber);
            answers[i] = isEven(randNumber) ? "yes" : "no";
        }

        // call the engine with game parameters
        Engine.runGame(TASK, questions, answers);
    }

    // checking if number is even or not
    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
