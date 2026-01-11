package com.self.switchDemo;

import java.util.Scanner;

public class switchDemo1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What noodles do u want?");
        String noodles = sc.nextLine();
        switch(noodles) {
            case "noodles 1":
                System.out.println("Eat noodles 1");
                break;
            case "noodles 2":
                System.out.println("Eat noodles 2");
                break;
            case "noodles 3":
                System.out.println("Eat noodles 3");
                break;
            case "noodles 4":
                System.out.println("Eat noodles 4");
                break;
            default:
                System.out.println("No noodles for u");
                break;
        }
    }
}
