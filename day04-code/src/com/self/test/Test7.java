package com.self.test;

import java.util.Scanner;

public class Test7 {
    static void main(String[] args) {
        // A palindromic number is the same when read forward and backward.
        // E.g. 12321 is a palindromic number, while 12345 is not.
        // Insert an integer from keyboard. If it is palindromic, print true.
        // If not, print false.

        // Get an integer from keyboard input
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer to determine if it's palindromic:");
        int number = sc.nextInt();

        if (number < 0){
            number *= -1;
        }

        // Find out number backwards
        int numberBackwards = 0;
        int i = number;
        while (i > 0){
            numberBackwards *= 10;
            numberBackwards += i % 10;
            i /= 10;
        }

        System.out.println(number + " is" + ((numberBackwards == number) ? "" : " not" ) + " palindromic." );
    }
}
