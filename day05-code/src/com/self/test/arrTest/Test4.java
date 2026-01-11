package com.self.test.arrTest;

public class Test4 {
    static void main(String[] args) {
        // Find the largest in array
        int[] arr = {1, 2, 3, 4, 5};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
