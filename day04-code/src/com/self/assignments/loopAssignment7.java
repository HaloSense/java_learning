package com.self.assignments;

public class loopAssignment7 {
    static void main(String[] args) {
        // Leap year calculation
        // A leap year mean that the year is divisible by both 4, but not divisible by 100.
        // If divisible by 400, It is also a leap year.
        // Print all leap years between 1988 and 2019
        System.out.println("All leap years between 1988 and 2019:");
        for (int year = 1988; year <= 2019; year++){
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
                System.out.println(year);
            }
        }
    }
}
