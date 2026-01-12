package com.halosense.test.loopTest;

public class Test1 {
    static void main(String[] args) {
        // Skip At 7
        // Print from 1 to 100, and skip those that:
        // 1. Contain 7
        // 2. Are divisible by 7
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7){
                System.out.println("Skip");
                continue;
            }
            System.out.println(i);
        }
    }
}
