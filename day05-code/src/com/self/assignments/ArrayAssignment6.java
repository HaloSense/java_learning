package com.self.assignments;

import javax.xml.transform.Source;
import java.util.Scanner;

public class ArrayAssignment6 {
    static void main(String[] args) {
        /*
            Given an array, its elements are arranged in
            ascending order.

            Input an integer from keyboard and insert it
            into the array, forming a new array.

            Elements of the new array should also be in
            ascending order.
         */

        int[] arr = {12,14,23,45,66,68,70,77,90,91};

        int[] arr2 = new int[arr.length + 1];

        System.out.println("Input an integer to insert: ");
        Scanner sc = new Scanner(System.in);
        int newInt = sc.nextInt();

        boolean flagInserted = false;

        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (!flagInserted && (arr[i] > newInt)) {
                arr2[j] = newInt;
                flagInserted = true;
                i--;
            } else {
                arr2[j] = arr[i];
            }
        }

        if (!flagInserted) arr2[arr2.length - 1] = newInt;

        System.out.print("The new array is: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
