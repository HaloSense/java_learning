package com.halosense.array;

public class ArrayDemo3 {
    static void main(String[] args) {
        int[] arr1 = {11, 22, 33};
        int[] arr2 = arr1;

        System.out.println(arr1[0]);    // 11
        System.out.println(arr2[0]);    // 11

        arr1[0] = 44;

        System.out.println(arr1[0]);    // 44
        System.out.println(arr2[0]);    // 44
    }
}
