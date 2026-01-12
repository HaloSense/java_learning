package com.halosense.test.forTest;

public class Test4 {
    static void main(String[] args) {
        // Sum of all even numbers between 1 and 100 (inclusive)
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
