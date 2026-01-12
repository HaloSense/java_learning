package com.halosense.assignments;

import java.util.Random;

public class Assignment11Corrected {
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
            1. Define a new array to store drawn prizes.
            2. Choose a random prize from prize set.
            3. Check if it has been drawn; if yes, draw again; if no,
                record it and output message.
            4. Repeat until all prizes are drawn (drawn prizes set is full)
         */

        // Random
        Random r = new Random();

        // Prize set
        int[] prizes = {2, 588, 888, 1000, 10000};
        // The prize
        int prize;

        // Drawn prize array, initialize as all false.
        int[] drawnPrizes = new int[prizes.length];
        int idxDrawn = 0;

        // Loop for prizes.length times to draw all prizes
        while (idxDrawn < drawnPrizes.length) {

            // Choose prize randomly
            int prizeIdx = r.nextInt(prizes.length);
            prize = prizes[prizeIdx];

            if (!contains(drawnPrizes, prize)) {
                drawnPrizes[idxDrawn] = prize;
                System.out.println("Prize " + prize + " is drawn.");
                idxDrawn++;
            }
        }
    }

    static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
