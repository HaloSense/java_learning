package com.self.test.arrTest;

public class Test1 {
    static void main(String[] args) {
        // Iterate through array and get the sum of all elements

        int[] arr = {1, 2, 3, 4, 5, 10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
