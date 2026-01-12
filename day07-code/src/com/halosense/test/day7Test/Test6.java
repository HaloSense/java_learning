package com.halosense.test.day7Test;

import java.util.Scanner;

public class Test6 {
    static void main(String[] args) {
        /*
            Passcode encryption

            Encrypt a passcode (digits only), following the rules:
                1. Retrieve each digitPlain
                2. For each digitPlain, plus 5 and modulo 10
                3. Reverse the order of digits
                4. Output
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the plain text (range for long type):");
        long codePlain = sc.nextLong();

        while (codePlain <= 0) {
            System.out.println("Invalid plain passcode! Try again:");
            codePlain = sc.nextLong();
        }

        int[] codePlainArr = longToDigitArr(codePlain);

        int[] codeCipherArr = new int[codePlainArr.length];

        for (int i = 0; i < codeCipherArr.length; i++) {
            codeCipherArr[i] = (codePlainArr[i] + 5) % 10;
        }

        int[] codeFinalArr = reverseArr(codeCipherArr);

        System.out.print("The encrypted code is: ");
        for (int i = 0; i < codeFinalArr.length; i++) {
            System.out.print(codeFinalArr[i]);
        }
    }

    static int[] longToDigitArr(long num) {
        int count = 0, digit = 0;
        long numTemp = num;
        while (numTemp > 0) {
            count++;
            numTemp /= 10;
        }
        int[] digitArr = new int[count];
        for (int i = digitArr.length - 1; i >= 0; i--) {
            digitArr[i] = (int) (num % 10);
            num /= 10;
        }
        return digitArr;
    }

    static int[] reverseArr(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[arr.length - 1 - i] = arr[i];
        }
        return reversedArr;
    }
}
