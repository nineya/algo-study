package com.nineya.algo.leetcode.algorithms;

import java.util.Arrays;

/**
 * @author 殇雪话诀别
 * 2021/4/17
 */
public class Solution_66 {
    public int[] plusOne(int[] digits) {
        boolean flag = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (flag) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i]++;
                    flag = false;
                }
            }
        }
        if (flag) {
            int[] nums = new int[digits.length + 1];
            nums[0] = 1;
            System.arraycopy(digits, 0, nums, 1, digits.length);
            return nums;
        }
        return digits;
    }

    public static void main(String[] args) {
        Solution_66 solution = new Solution_66();
        int[] nums = solution.plusOne(new int[]{1,2,3});
        for (int n : nums) {
            System.out.print(n);
        }
        System.out.println();
        nums = solution.plusOne(new int[]{0});
        for (int n : nums) {
            System.out.print(n);
        }
        System.out.println();
        nums = solution.plusOne(new int[]{9});
        for (int n : nums) {
            System.out.print(n);
        }
        System.out.println();
    }
}
