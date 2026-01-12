package com.halosense.assignments;

import java.util.Scanner;

public class ifAssignment4 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get customer type, 0 = normal, 1 = VIP
        System.out.println("Input customer type:");
        int customerType = sc.nextInt();
        // Get price of products
        System.out.println("Input price:");
        int price = sc.nextInt();

        //
        double finalPrice = 0.0;
        switch (customerType){
            // Normal customer
            case 0 -> {
                if (price >= 100){
                    finalPrice = 0.9 * price;
                } else {
                    finalPrice = price;
                }
            }
            case 1 -> {
                if (price >= 200){
                    finalPrice = 0.75 * price;
                } else {
                    finalPrice = 0.8 * price;
                }
            }
            default -> System.out.println("Invalid customer type!");
        }

        System.out.println("Final price is " + finalPrice);

    }
}
