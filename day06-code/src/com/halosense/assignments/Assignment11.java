package com.halosense.assignments;

import java.util.Random;

public class Assignment11 {
    static void main(String[] args) {
        /*
            Requirements:
            Randomly choose from a prize set of 5 prizes,
            {2, 588, 888, 1000, 10000}.
            Each prize can be chosen only once.
            Output for each prize chosen.
         */

        /*
            Steps:
            1. Define a new array to store flags, each element marks the status
                of the prize.
            2. Choose a random prize from prize set.
            3. Set the corresponding flag for the prize.
            3. Output message
         */

        // Random
        Random r = new Random();

        // Prize set
        int[] prizes = {2, 588, 888, 1000, 10000};
        // The prize
        int prize = 0;

        // Prize flag array, initialize as all false.
        boolean[] isPrizeDrawnArr = new boolean[prizes.length];

        // Loop for prizes.length times to draw all prizes
        for (int i = 0; i < prizes.length; i++) {

            // Choose prize randomly
            int prizeIdx = r.nextInt(prizes.length);

            // If prize not drawn
            if (!isPrizeDrawnArr[prizeIdx]) {
                drawPrize(prizes, prizeIdx);
                isPrizeDrawnArr[prizeIdx] = true;
            } else {
                i--;
                continue;
            }
        }
    }

    static void drawPrize(int[] prizes, int idx) {
        System.out.println("Prize " + prizes[idx] + " is drawn.");
    }
}
