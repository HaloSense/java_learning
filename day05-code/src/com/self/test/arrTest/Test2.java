package com.self.test.arrTest;

public class Test2 {
    static void main(String[] args) {
        // Iterate through an array
        // and find out how many of the elements is divisible by 3
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println("There are " + count + " numbers divisible by 3.");
    }
}
