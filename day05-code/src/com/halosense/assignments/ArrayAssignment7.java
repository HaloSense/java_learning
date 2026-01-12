package com.halosense.assignments;

import java.util.Arrays;
import java.util.Random;

public class ArrayAssignment7 {
    static void main(String[] args) {
        /*
            Given an integer array, move its odd
            elements to the left side and its
            even elements to the right side.

            Creating a new array is allowed.

            Try realizing it in both a new array
            and the original array.
         */

        // Generate a random array for each run
        // Between 0~99
        Random r = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }

        // New array

        // Declaration
        int[] arr2 = new int[arr.length];
        int j = 0;
        int k = arr.length - 1;

        /*
            Iterate arr
            Maintain pointers j and k:
             j is the index for odd #s, init -> 0.
             k is the index for even #s, init -> arr.length - 1.
             For every arr[i], find out its parity
             If even, arr2[k] <- arr[i], k--
             If odd, arr2[j] <- arr[i], j++
         */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr2[k] = arr[i];
                k--;
            } else {
                arr2[j] = arr[i];
                j++;
            }
        }

        System.out.println("Original array is: " + Arrays.toString(arr));
        System.out.println("Result array is: " + Arrays.toString(arr2));

        // Original array
        /*
            Maintain two pointers i and j;
            i: init -> 0, scan from left to right
            j: init -> arr.length - 1, scan from right to left
            Loop condition: i < j;
            In loop:
                If arr[i] is odd, i++;
                If arr[j] is even, j--;
                If above are not met, arr[i] is even and arr[j] is odd. Swap them
                    and i++, j--
         */
        j = arr.length - 1;
        for (int i = 0; i < j;) {
            if (arr[i] % 2 == 1) {
                i++;
                continue;
            }
            if (arr[j] % 2 == 0) {
                j--;
                continue;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println("Original array (manipulated) is: " + Arrays.toString(arr));

    }
}
