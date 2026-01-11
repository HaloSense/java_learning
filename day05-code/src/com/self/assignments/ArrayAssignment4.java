package com.self.assignments;

public class ArrayAssignment4 {
    static void main(String[] args) {
        /*
            Given an integer array whose elements are integers
            between 0 and 9.

            The element with the largest index represents the
            ones of an integer, the element with the
            second-largest index represents the tens, etc.

            Find the integer the array represents.
         */

        int[] arr = {9, 5, 5, 3, 7, 4, 2, 8};
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result *= 10;
            result += arr[i];
        }

        System.out.println("The integer is " + result);
    }
}
