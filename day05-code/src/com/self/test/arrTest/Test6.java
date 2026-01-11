package com.self.test.arrTest;

import java.util.Arrays;

public class Test6 {
    static void main(String[] args) {
        /*
            Declare an array, reverse the order of its elements
         */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9, 8, 7, 10, 18};

//        int temp = arr[arr.length - 1];
//        arr[arr.length - 1] = arr[0];
//        arr[0] = temp;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
