package com.self.test;

import java.util.Scanner;

public class Test5 {
    static void main(String[] args) {
        // Insert 2 numbers as a range
        // Find out how many numbers there are in the range that
        // are divisible by BOTH 3 AND 5

        // Scanner
        Scanner sc = new Scanner(System.in);

        // Get 2 numbers from keyboard
        System.out.println("Insert first number");
        int r1 = sc.nextInt();
        System.out.println("Insert second number");
        int r2 = sc.nextInt();

        // Let r2 be the larger one
        if (r1 > r2){
            int temp = r1;
            r1 = r2;
            r2 = temp;
        }

        // Loop
        int count = 0;
        for (int i = r1; i <= r2; i++){
            if (i % 3 == 0 && i % 5 == 0){
                count++;
            }
        }

        System.out.println("In the range of " + r1 + " and " + r2 + ", there are " + count
            + " numbers that are divisible by both 3 and 5.");

    }
}
