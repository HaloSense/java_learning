package com.self.test;

import java.util.Scanner;

public class Test2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What service do you need?");
        int serviceInt = sc.nextInt();
        switch (serviceInt) {
            case 1 -> System.out.println("Flight Ticket Inquiry");
            case 2 -> System.out.println("Flight Ticket Reservation");
            case 3 -> System.out.println("Flight Ticket Reschedule");
            default -> System.out.println("Exit");
        }
    }
}
