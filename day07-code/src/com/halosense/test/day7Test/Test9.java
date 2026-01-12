package com.halosense.test.day7Test;

import java.util.Arrays;
import java.util.Random;

public class Test9 {
    static void main(String[] args) {
        /*
            双色球实现

            投注号码由6个红色球号码和1个蓝色球号码组成，红色球号码从1~33中选择，蓝色球号码从1~16中选择。
            中奖条件如下：
                1. 6红1蓝：1000万元
                2. 6红0蓝：500万元
                3. 5红1蓝：3000元
                4. 5红0蓝、4红1蓝：200元
                5. 4红0蓝、3红1蓝：10元
                6. 2红1蓝、1红1蓝、0红1蓝：5元
                7. 其他：未中奖，0元
         */

        int[] winningNumbers = createNumbers();

        System.out.println(Arrays.toString(winningNumbers));

    }

    static int[] createNumbers() {
        int[] winningNumbers = new int[6 + 1];

        Random r = new Random();

        // 生成中奖号码
        // 红球互相不重复
        for (int i = 0; i < 6;) {
            int randomRed = r.nextInt(1, 34);
            if (!contains(winningNumbers, randomRed)) {
                winningNumbers[i] = randomRed;
                i++;
            }
        }

        int randomBlue = r.nextInt(1, 17);
        winningNumbers[6] = randomBlue;

        return winningNumbers;

    }

    static boolean contains(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }
        return false;
    }
}
