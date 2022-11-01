package hexlet.code;

import java.util.Random;

public class RandomUtils {

    // simple method to generate one random number of max length
    public static int getRandomNumber(int max) {
        Random rand = new Random();
        return rand.nextInt(max - 1) + 1;
    }

    // a method to generate non-zero step for progression
    public static int generateStep(int diff) {
        Random rand = new Random();
        int step = 0;

        // change diff value in case it's generated as zero to make game more fun
        while (step == 0) {
            step = rand.nextInt(diff);
        }
        return step;
    }
}
