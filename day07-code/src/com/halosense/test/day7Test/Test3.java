package com.halosense.test.day7Test;

import java.util.Random;

public class Test3 {
    static void main(String[] args) {
        /*
            Randomly generate a verification code.

            The verification code should follow the following pattern:
                1. Length is 5
                2. The first four characters are uppercase or lowercase letters
                3. The last character is a number

            ASCII ranges:
            Uppercase letters: 65~90, inclusive
            Lowercase letters: 97~122, inclusive
         */

        // Random
        Random r = new Random();

        System.out.print("The verification code is: ");

        for (int i = 0; i < 4; i++) {
            if (r.nextInt(2) == 0) {
                System.out.print((char)r.nextInt(65, 91));
            } else {
                System.out.print((char)r.nextInt(97, 123));
            }
        }
        System.out.print(r.nextInt(10));
    }
}
