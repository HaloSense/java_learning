package com.halosense.test.methodTest;

public class Test3 {
    static void main(String[] args) {
        /*
            Method Exercise: compare the areas of two rectangles

            Input: two lengths, two widths

            Output: print result
         */

        // Requirement analysis
        // What to do?
        // 1. Find two areas
        // 2. Compare them
        // 3. Print result

        areaCompare(5, 5, 8, 7);
        areaCompare(3, 6, 5, 2);
        areaCompare(20, 5, 10, 10);

    }

    static void areaCompare(int len1, int width1, int len2, int width2){
        int area1 = getArea(len1, width1);
        int area2 = getArea(len2, width2);

        if (area1 > area2) {
            System.out.println("Rectangle 1 is larger than rectangle 2.");
        } else if (area1 < area2) {
            System.out.println("Rectangle 2 is larger than rectangle 1.");
        } else {
            System.out.println("Rectangle 1 and rectangle 2 has the same area size.");
        }
    }

    static int getArea(int len, int width){
        // A method to calculate rectangle area
        return len * width;
    }
}
