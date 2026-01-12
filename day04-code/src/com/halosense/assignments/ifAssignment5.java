package com.halosense.assignments;

import java.util.Scanner;

public class ifAssignment5 {
    static void main(String[] args) {
        // Taxes
        // Use only if and if..else

        /*
        0~5000, 0
        5000~8000, 0.03
        8000~17000, 0.1
        17000~30000, 0.2
        30000~40000, 0.25
        40000~60000, 0.3
        60000~85000, 0.35
        85000~, 0.45
         */

        Scanner sc = new Scanner(System.in);

        // Get salary before tax
        System.out.println("Input salary before tax:");
        int salary = sc.nextInt();

        double salaryBeforeTax = salary * 0.9 - 5000;

        double tax = 0;

        if (salaryBeforeTax <= 3000){
            tax = salaryBeforeTax * 0.03;
        } else if (salaryBeforeTax > 3000 && salaryBeforeTax <= 12000){
            tax = 3000 * 0.03 + (salaryBeforeTax - 3000) * 0.1;
        } else if (salaryBeforeTax > 12000 && salaryBeforeTax <= 25000){
            tax = 3000 * 0.03 + 9000 * 0.1 + (salaryBeforeTax - 12000) * 0.2;
        } else if (salaryBeforeTax > 25000 && salaryBeforeTax <= 35000){
            tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + (salaryBeforeTax - 25000) * 0.25;
        } else if (salaryBeforeTax > 35000 && salaryBeforeTax <= 55000){
            tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + (salaryBeforeTax - 35000) * 0.3;
        } else if (salaryBeforeTax > 55000 && salaryBeforeTax <= 80000){
            tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3 + (salaryBeforeTax - 55000) * 0.35;
        } else if (salaryBeforeTax > 80000){
            tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3 + 25000 * 0.35 + (salaryBeforeTax - 80000) * 0.45;
        } else {
            System.out.println("Invalid salary!");
        }

        double salaryAfterTax = salary * 0.9 - tax;

        System.out.println("Amount of tax: " + tax);
        System.out.println("Salary after tax: " + salaryAfterTax);



    }
}
