package com.halosense.assignments;

import java.util.Arrays;

public class Assignment10 {
    static void main(String[] args) {
        /*
            Define a method, copyOfRange(int[] arr,int from, int to)
         */
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newArr = copyOfRange(arr, 2, 7);
        int[] newArr2 = copyOfRange(arr, 4, 9);

        System.out.println("newArr = " + Arrays.toString(newArr));
        System.out.println("newArr2 = " + Arrays.toString(newArr2));
    }

    static int[] copyOfRange(int[] arr,int from, int to) {
        int[] copyArr = new int[to - from];
        for (int i = from; i < to; i++) {
            copyArr[i - from] = arr[i];
        }
        return copyArr;
    }
}
