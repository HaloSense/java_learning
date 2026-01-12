package com.halosense.test.methodTest;

public class Test2 {
    static void main(String[] args) {
        /*
            Define a method to find the area of a circle.
            Print the result in the console.
         */

        areaCircle(5.0);
        areaCircle(33.3);

    }

    static void areaCircle(double radius){
        double area = 3.14 * radius * radius;
        System.out.println("Area of the circle is " + area);
    }
}
