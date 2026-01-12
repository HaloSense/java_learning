package com.halosense.methodDemo;

public class MethodDemo5 {
    static void main(String[] args) {
        int sum = getSum(5, 6, 7, 80);
        System.out.println(sum);
        sum = getSum(6, 99, 6, 98);
        System.out.println(sum);
    }

    static int getSum(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }
}
