package com.halosense.test.day7Test;

import java.util.Scanner;

public class Test1 {
    static void main(String[] args) {
        /*
            Flight Tickets

            Flight ticket prices varies for different seasons.

            Input: original ticket price, month, class type (first class or economy class)
            Output: actual ticket price.

            Rules:
                1. For peak season (5 ~ 10), first class tickets are 10% off,
                    economy class tickets are 15% off.
                2. For off season (11 ~ 4), first class tickets are 30% off,
                    economy class tickets are 35% off.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Input original ticket price (int):");
        int originalPrice = sc.nextInt();

        System.out.println("Input number of month (int, 1 ~ 12):");
        int month = sc.nextInt();
        // Handling wrong inputs
        while (month > 12 || month < 1) {
            System.out.println("Invalid month! Please input number of month (int, 1 ~ 12):");
            month = sc.nextInt();
        }

        System.out.println("Input class type (1 for first class, 2 for economy class):");
        int classInt = sc.nextInt();
        // Handling wrong inputs
        while (classInt != 1 && classInt != 2) {
            System.out.println("Invalid class type! Please input class type (1 for first, 2 for economy):");
            classInt = sc.nextInt();
        }

        double discountPrice = 0.0;

        // Peak season
        if (month >= 5 && month <= 10) {
            discountPrice = calculatePrice(originalPrice, classInt, 0.9, 0.85);
        } else if (month >= 1 && month <= 12){ // Off season
            discountPrice = calculatePrice(originalPrice, classInt, 0.7, 0.65);
        } else {
            System.out.println("Invalid month! Please try again.");
        }

        System.out.println("Discount ticket price is " + discountPrice + ".");
    }

    static double calculatePrice(int price, int classInt, double firstClassCoef, double economyClassCoef) {

        double discountPrice = 0.0;

        if (classInt == 1) { // First class
            discountPrice = price * firstClassCoef;
        } else if (classInt == 2) { // Economy class
            discountPrice = price * economyClassCoef;
        } else {
            System.out.println("Invalid class type! Please try again.");
        }

        return discountPrice;
    }
}
