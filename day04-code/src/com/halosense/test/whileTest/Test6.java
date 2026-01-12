package com.halosense.test.whileTest;

public class Test6 {
    static void main(String[] args) {
        // Consider Mount Everest. Its height is 8844.43m, or 8844430 mm.
        // Consider a piece of paper with thickness of 0.1mm.
        // How many times do we need to fold the paper for it to be thicker than Mt. Everest?
        // Print the number of folds.

        double targetHeight = 8844430;
        double paperThickness = 0.1;
        int countFolds = 0;

        while (paperThickness < targetHeight){
            paperThickness *= 2;
            countFolds++;
        }

        System.out.println("We need to fold the paper " + countFolds
                + " times for it to be thicker than Mt. Everest.");

    }
}
