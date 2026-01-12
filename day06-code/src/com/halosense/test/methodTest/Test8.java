package com.halosense.test.methodTest;

public class Test8 {
    static void main(String[] args) {
        /*
            Define a method, copyOfRange(int[] arr, int from, int to)
            Its function is to copy the values in arr[], from the index "from" (inclusive)
            to index "to" (exclusive) to a new array.
            Return the new array.
         */

        int[] arr = {0, 11, 22, 33, 44, 55, 66, 77, 88, 99};
        int[] arr2 = copyOfRange(arr, 3,  8);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }

    static int[] copyOfRange(int[] arr, int from, int to) {
        int[] resultArr = new int[to - from];
        for (int i = from; i < to; i++) {
            resultArr[i - from] = arr[i];
        }
        return resultArr;
    }
}
