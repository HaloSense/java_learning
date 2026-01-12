package com.halosense.test.comprehensiveTest;

import java.util.Scanner;

public class Test9 {
    static void main(String[] args) {
        // Implement division WITHOUT the arithmetic operators: multiplication (*), division (/), modulo (%)

        // Get two integers, dividend and divisor
        // Calculate their quotient and remainder
        // Don't use '*', '/', or '%'.

        /*
        Thoughts:
            Division is essentially looped extraction.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Input dividend:");
        int dividend = sc.nextInt();
        System.out.println("input divisor:");
        int divisor = sc.nextInt();

        int quotient = 0;
        int remainder = 0;

        while (dividend >= divisor){
            quotient++;
            dividend -= divisor;
        }
        remainder = dividend;

        System.out.println(quotient);
        System.out.println(remainder);
    }
}
