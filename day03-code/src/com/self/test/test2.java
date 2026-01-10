package com.self.test;

import java.util.Scanner;

public class test2 {
    static void main() {
        // 输入两个数字，如果其中一个为6，那么结果为true
        // 如果它们的和是6的倍数，那么结果为true
        // 其他情况为false
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first integer: ");
        int n1 = sc.nextInt();
        System.out.println("Input second integer: ");
        int n2 = sc.nextInt();

        boolean result = n1 == 6 || n2 == 6 || (n1 + n2) % 6 == 0;

        System.out.println(result);

    }
}
