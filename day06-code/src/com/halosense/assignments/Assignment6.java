package com.halosense.assignments;

public class Assignment6 {
    static void main(String[] args) {
        /*
            Define method equals(int[] arr1, int[] arr2)
            to determine if two arrays are the same.
            If the two arrays have the same length and elements,
            they are the same.
         */

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        System.out.println("Is arr1 the same as arr2? " + equals(arr1, arr2));

        int[] arr3 = {1, 2, 3, 4, 5, 6};
        int[] arr4 = {1, 2, 3, 7, 5, 6};
        System.out.println("Is arr3 the same as arr4? " + equals(arr3, arr4));

        int[] arr5 = {1, 2, 3, 7, 8, 9};
        int[] arr6 = {1, 2, 3, 7, 8, 9};
        System.out.println("Is arr5 the same as arr6? " + equals(arr5, arr6));

    }

    static boolean equals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
