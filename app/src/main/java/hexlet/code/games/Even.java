package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
public class Even {

    // main method to run the game
    public static void startEvenGame() {
        Random rand = new Random();
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        // generate questions and answers array
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randNumber = rand.nextInt(Engine.RANGE);
            questions[i] = String.valueOf(randNumber);
            answers[i] = isEven(randNumber) ? "yes" : "no";
        }

        // call the engine with game parameters
        Engine.runGame(task, questions, answers);
    }

    // checking if number is even or not
    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
