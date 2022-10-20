package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {

    // length of generated progression
    private static final int LENGTH = 10;

    // main method to run the game
    public static void startProgGame() {
        Random rand = new Random();
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        String task = "What number is missing in the progression?";

        // generate questions and answers array
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randPlace = rand.nextInt(LENGTH);
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
        int init = rand.nextInt(100);
        int diff = rand.nextInt(10);
        arr[0] = String.valueOf(init);

        for (int i = 1; i < LENGTH; i++) {
            arr[i] = String.valueOf(Integer.parseInt(arr[i - 1]) + diff);
        }

        return arr;
    }
}
