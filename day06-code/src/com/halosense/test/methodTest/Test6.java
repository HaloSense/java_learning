package com.halosense.test.methodTest;

public class Test6 {
    static void main(String[] args) {
        /*
            Design a method to find the largest value within an array.
            Return the value.
         */

        int[] arr = {15, 37, 563, -2, 99};
        int max = findMax(arr);
        System.out.println("The largest value of array is " + max + ".");
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
