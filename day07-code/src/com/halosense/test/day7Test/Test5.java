package com.halosense.test.day7Test;

import java.util.Scanner;

public class Test5 {
    static void main(String[] args) {
        /*
            Score calculation

            There are 6 judges rating a contestant in a contest.
            Each score is an integer between 0 and 100 (both inclusive).

            The contestant's final score is the mean value of the scores,
            but with the highest score and the lowest score removed.
         */
        int numJudges = 6;
        int[] scores = getScores(6);

        int max = getMax(scores);
        int min = getMin(scores);
        int sum = getSum(scores);

        double finalScore = (double) (sum - max - min) / (scores.length - 2);

        System.out.println("Final Score is " + finalScore);
    }

    static int[] getScores(int numJudges) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[numJudges];
        int score;
        for (int i = 0; i < numJudges;) {
            System.out.println("Input the score given by judge No. " + (i + 1) + ":");
            score = sc.nextInt();
            if (score > 100 || score < 0) {
                System.out.println("Score out of range!");
            } else {
                scores[i] = score;
                i++;
            }
        }
        return scores;
    }

    static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
