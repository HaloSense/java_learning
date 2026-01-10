package com.self.arithmeticOperator;

public class ArithmeticOperatorDemo5 {
    static void main(String[] args) {
        // ++ and --
        int a = 10;
//        a++;
//        System.out.println(a);
//        ++a;
//        System.out.println(a);
//        a--;
//        System.out.println(a);
//        --a;
//        System.out.println(a);
        System.out.println("a = " + a);
        // add after use
        int b = a++;
        System.out.println("b <- a++");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // use after add
        int c = ++a;
        System.out.println("c <- ++a");
        System.out.println("a = " + a);
        System.out.println("c = " + c);
    }
}
