package com.self.test.arrTest;

import java.util.Arrays;

public class Test3 {
    static void main(String[] args) {
        // Array element manipulation
        // Iterate through the array
        // If the element is even number, half it
        // If the element is odd number, double it
        
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] % 2 == 1) ? arr[i] * 2 : arr[i] / 2;
        }

        System.out.println(Arrays.toString(arr));
        
    }
}
