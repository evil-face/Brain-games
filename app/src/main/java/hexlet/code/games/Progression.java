package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Progression {

    // game task
    private static final String TASK = "What number is missing in the progression?";

    // length of generated progression
    private static final int LENGTH = 10;

    // biggest generated random number used as progression difference
    private static final int DIFF = 10;

    // main method to run the game
    public static void startProgGame() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];

        // generate questions and answers array
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randPlace = RandomUtils.getRandomNumber(LENGTH);
            int init = RandomUtils.getRandomNumber(Engine.RANGE);
            int step = RandomUtils.generateStep(DIFF);
            // get new array
            String[] currentStr = generateProg(init, step, LENGTH);

            // write an answer and then change it to secret mask in a random place
            answers[i] = currentStr[randPlace];
            currentStr[randPlace] = "..";

            questions[i] = String.join(" ", currentStr);
        }

        // call the engine with game parameters
        Engine.runGame(TASK, questions, answers);
    }

    // a method to generate full progression in string array
    private static String[] generateProg(int initialValue, int step, int progressionLength) {
        String[] arr = new String[progressionLength];
        arr[0] = String.valueOf(initialValue);

        // fill array with full progression
        for (int i = 1; i < progressionLength; i++) {
            arr[i] = String.valueOf(Integer.parseInt(arr[i - 1]) + step);
        }

        return arr;
    }
}
