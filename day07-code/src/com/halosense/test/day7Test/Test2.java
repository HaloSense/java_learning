package com.halosense.test.day7Test;

public class Test2 {
    static void main(String[] args) {
        /*
            Find prime numbers

            Count the prime numbers between 101 and 200.

            Output the count of prime numbers and all these prime numbers.
         */

        int count = 0;
        for (int i = 101; i < 200; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number.");
            }
        }
        System.out.println("There are " + count + " prime numbers between 101 (inclusive) and 200 (exclusive).");
    }

    static boolean isPrime(int number) {
        if (number <= 0) {
            System.out.println("Prime numbers are positive by definition!");
            return false;
        }
        if (number == 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
