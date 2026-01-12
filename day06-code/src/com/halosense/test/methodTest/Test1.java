package com.halosense.test.methodTest;

public class Test1 {
    static void main(String[] args) {
        /*
            Define a method to find the perimeter of a rectangle.
            Print the result in the console.
         */

        perimeterRectangle(10, 15);
        perimeterRectangle(20, 33);

    }

    static void perimeterRectangle(int len, int width){
        int perimeter = (len + width) * 2;
        System.out.println("Perimeter of the rectangle is " + perimeter);
    }
}
