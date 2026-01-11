package com.self.test.loopTest;

import java.util.Random;
import java.util.Scanner;

public class Test5 {
    static void main(String[] args) {
        // Number guessing game
        // 1~100

        Random r = new Random();
        int target = r.nextInt(1, 101);

        Scanner sc = new Scanner(System.in);

        int inputNumber = 0;
        while (true){
            System.out.println("Guess an integer! Make your guess between 1 and 100 (inclusive):");
            inputNumber = sc.nextInt();
            if (inputNumber == target){
                System.out.println("Bingo! You got it!");
                break;
            } else if (inputNumber < target){
                System.out.println("Wrong! Guess larger numbers!");
            } else {
                System.out.println("Wrong! Guess smaller numbers!");
            }
        }
    }
}
