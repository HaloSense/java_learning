package com.self.test;
import java.util.Scanner;

public class test1 {
    static void main(String[] args) {

        // retrieve a 3-digit integer from keyboard input
        // output its digits, from ones to hundreds

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert integer with 3 digits:");
        int n = sc.nextInt();
        int ones = n % 10;
        int tens = n / 10 % 10;
        int hundreds = n / 100 % 10;

        System.out.println("the ones digit: " + ones);
        System.out.println("the tens digit: " + tens);
        System.out.println("the hundreds digit: " + hundreds);

    }
}
