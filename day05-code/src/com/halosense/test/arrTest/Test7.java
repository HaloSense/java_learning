package com.halosense.test.arrTest;

import java.util.Arrays;
import java.util.Random;

public class Test7 {
    static void main(String[] args) {
        /*
            Randomly scramble the order of elements in a given array
         */

        // How to:
        // Iterate through array
        // Swap arr[i] with arr[j]
        // where j is a random number between i and arr.length (exclusive)

        Random r = new Random();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            int j = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
