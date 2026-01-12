package com.halosense.test.loopTest;

import java.util.Scanner;

public class Test3 {
    static void main(String[] args) {
        // Prime number
        // Input a positive integer, determine if it's a prime number
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a positive integer:");
        int n = sc.nextInt();

        if (n == 1){
            System.out.println("1 is not a prime number.");
            return;
        }

        if (n == 2) {
            System.out.println("2 is a prime number.");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }

    }
}
