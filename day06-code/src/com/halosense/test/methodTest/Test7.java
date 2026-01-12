package com.halosense.test.methodTest;

public class Test7 {
    static void main(String[] args) {
        /*
            Design a method to determine if a value is present in an array.
            Return the result (presence of value).
         */

        int[] arr = {14, 28, 153, -434, 99};
        int target = -434;

        boolean flag = contains(arr, target);
        if (flag) {
            System.out.println("The number " + target + " is in the array.");
        } else {
            System.out.println("The number " + target + " is not in the array.");
        }

    }

    static boolean contains(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }


}
