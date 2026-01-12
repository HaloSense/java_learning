package com.halosense.logicOperator;

public class LogicOperatorDemo3 {
    static void main(String[] args) {
        // short-circuit operators

        // 1. &&
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(false && false);

        // 2. ||
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(false || false);

        // 3. short-circuit
        // If the operand on the left side can determine the final result,
        // the operand on the right will be skipped.
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);

    }
}
