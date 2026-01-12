package com.halosense.test.methodTest;

public class Test4 {
    static void main(String[] args) {
        /*
            Use method reloading, compare two numbers.
            Requirement: compatible with different integer types (byte, short, int, long)
         */

        byte byte1 = 3, byte2 = 5;
        compare(byte1, byte2);

        short short1 = 60, short2 = 55;
        compare(short1, short2);

        int int1 = 355, int2 = 355;
        compare(int1, int2);

        long long1 = 56789, long2 = 12345;
        compare(long1, long2);

    }

    static void compare(byte b1, byte b2){
        if (b1 > b2) {
            System.out.println(b1 + " is larger than " + b2 + ".");
        } else if (b1 < b2) {
            System.out.println(b2 + " is larger than " + b1 + ".");
        } else {
            System.out.println(b1 + " is equal to " + b2 + ".");
        }
    }

    static void compare(short s1, short s2){
        if (s1 > s2) {
            System.out.println(s1 + " is larger than " + s2 + ".");
        } else if (s1 < s2) {
            System.out.println(s2 + " is larger than " + s1 + ".");
        } else {
            System.out.println(s1 + " is equal to " + s2 + ".");
        }
    }

    static void compare(int i1, int i2){
        if (i1 > i2) {
            System.out.println(i1 + " is larger than " + i2 + ".");
        } else if (i1 < i2) {
            System.out.println(i2 + " is larger than " + i1 + ".");
        } else {
            System.out.println(i1 + " is equal to " + i2 + ".");
        }
    }

    static void compare(long n1, long n2){
        if (n1 > n2) {
            System.out.println(n1 + " is larger than " + n2 + ".");
        } else if (n1 < n2) {
            System.out.println(n2 + " is larger than " + n1 + ".");
        } else {
            System.out.println(n1 + " is equal to " + n2 + ".");
        }
    }

}
