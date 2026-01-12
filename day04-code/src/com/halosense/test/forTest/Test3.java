package com.halosense.test.forTest;

public class Test3 {
    static void main(String[] args) {
        // For loop tests
        // 1. Output 1~5

        /*
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        // 2. Output 5~1
        for (int i = 5; i >= 1; i--){
            System.out.println(i);
        }
        */

        // 3. Output sum of 1~5
        int sum = 0;
        for (int i = 1; i <= 5; i++){
            sum += i;
        }
        System.out.println(sum);

    }

}
