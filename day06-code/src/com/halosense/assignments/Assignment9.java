package com.halosense.assignments;

import java.util.Arrays;

public class Assignment9 {
    static void main(String[] args) {
        /*
            Define a method, copyOf(int[] arr, int newLength)
            Copy the first newLength elements to a new array.
            Return the new array.
         */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] newArr = copyOf(arr, 5);
        int[] newArr2 = copyOf(newArr, 3);

        System.out.println("newArr = " + Arrays.toString(newArr));
        System.out.println("newArr2 = " + Arrays.toString(newArr2));

    }

    static int[] copyOf(int[] arr, int newLength) {
        int[] newArr = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
