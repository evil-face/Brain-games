package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
public class Even {
    public static void startEvenGame() {
        Random rand = new Random();
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randNumber = rand.nextInt(100);
            questions[i] = String.valueOf(randNumber);
            answers[i] = (randNumber % 2 == 0) ? "yes" : "no";
        }

        Engine.runGame(task, questions, answers);
    }
}
