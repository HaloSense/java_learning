package com.halosense.logicOperator;


public class LogicOperatorDemo1 {
    static void main(String[] args) {
        // 1. and, &
        System.out.println(true & true);
        System.out.println(false & true);
        System.out.println(false & false);

        // 2. or, |
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | false);

        // 3. exclusive or, "XOR", ^
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);

        // 4. not, !
        System.out.println(!true);
        System.out.println(!false);
    }
}
