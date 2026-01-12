package com.halosense.assignments;

import java.util.Arrays;

public class Assignment8 {
    static void main(String[] args) {
        /*
            Define a method, fill(int[] arr,int fromIndex,int toIndex,int value)
            Change the values of indices [fromIndex, toIndex) to integer "value"
         */

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        fill(arr, 5, 9, 100);
        System.out.println("Array arr is now: " + Arrays.toString(arr));

        fill(arr, 2, 6, 200);
        System.out.println("Array arr is now: " + Arrays.toString(arr));

    }

    static void fill(int[] arr, int fromIndex, int toIndex, int value) {
        for (int i = fromIndex; i < toIndex; i++) {
            arr[i] = value;
        }
    }
}
