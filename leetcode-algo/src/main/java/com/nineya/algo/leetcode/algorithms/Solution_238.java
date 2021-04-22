package com.nineya.algo.leetcode.algorithms;

public class Solution_238 {
    public int[] productExceptSelf(int[] nums) {
        int[] ints = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ints[i] = 1;
        }
        int left = 1;
        int rigth = 1;
        for (int i = 1; i < nums.length; i++) {
            left *= nums[i - 1];
            ints[i] *= left;
            rigth *= nums[nums.length - i];
            ints[nums.length - i - 1] *= rigth;

        }
        return ints;
    }

    public static void main(String[] args) {
        Solution_238 solution = new Solution_238();
        int[] s = solution.productExceptSelf(new int[]{1, 2, 3, 4});
        for (int ss : s) {
            System.out.print(ss + " ");
        }
        System.out.println();
    }
}
