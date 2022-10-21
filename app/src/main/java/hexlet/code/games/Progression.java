package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {

    // length of generated progression
    private static final int LENGTH = 10;

    // biggest generated random number used as progression difference
    private static final int DIFF = 10;

    // main method to run the game
    public static void startProgGame() {
        Random rand = new Random();
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        String task = "What number is missing in the progression?";

        // generate questions and answers array
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randPlace = rand.nextInt(LENGTH);

            // get new array
            String[] currentStr = generateProg();

            // write an answer and then change it to secret mask in a random place
            answers[i] = currentStr[randPlace];
            currentStr[randPlace] = "..";

            questions[i] = String.join(" ", currentStr);
        }

        // call the engine with game parameters
        Engine.runGame(task, questions, answers);
    }

    // a method to generate full progression in string array
    public static String[] generateProg() {
        Random rand = new Random();
        String[] arr = new String[LENGTH];
        int init = rand.nextInt(Engine.RANGE);
        arr[0] = String.valueOf(init);
        int diff = 0;

        // change diff value in case it's generated as zero to make game more fun
        while (diff == 0) {
            diff = rand.nextInt(DIFF);
        }

        // fill array with full progression
        for (int i = 1; i < LENGTH; i++) {
            arr[i] = String.valueOf(Integer.parseInt(arr[i - 1]) + diff);
        }

        return arr;
    }
}
