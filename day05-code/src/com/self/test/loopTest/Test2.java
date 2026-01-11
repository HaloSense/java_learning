package com.self.test.loopTest;

import java.util.Scanner;

public class Test2 {
    static void main(String[] args) {
        // Square root simplified
        // Input an integer, return its square root (only integer part)

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a positive integer:");
        int n = sc.nextInt();

        int i = 0;
        while (i * i <= n){
            i++;
        }
        System.out.println("Square root of " + n + " is " + (i - 1));
    }
}
