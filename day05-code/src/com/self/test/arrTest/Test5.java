package com.self.test.arrTest;

import java.util.Arrays;
import java.util.Random;

public class Test5 {
    static void main(String[] args) {
        /*
            Generate 10 random numbers between 1 and 100
            Store them in an array
            Find their sum and mean
            Find out how many of them are smaller than the mean value
         */
        Random r = new Random();

        int[] arr = new int[10];
        int sum = 0;
        double mean = 0.0;

        // One code block for one job
        // Fill the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(1, 101);
        }

        // Calculate the sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Calculate the mean
        mean = (double) sum / arr.length;

        // Find out number of elements smaller than mean value
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mean) {
                count++;
            }
        }

        System.out.println("Array is " + Arrays.toString(arr));
        System.out.println("Sum is " + sum);
        System.out.println("Mean is " + mean);
        System.out.println("There are " + count + " numbers smaller than mean value");

    }
}
