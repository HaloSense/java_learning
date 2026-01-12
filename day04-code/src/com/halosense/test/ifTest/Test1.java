package com.halosense.test.ifTest;

import java.util.Scanner;

public class Test1 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("输入身上钱数");
        int money = sc.nextInt();
        if (money >= 100) {
            System.out.println("网红餐厅");
        } else {
            System.out.println("沙县小吃");
        }


    }
}
