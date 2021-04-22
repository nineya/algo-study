package com.nineya.algo.leetcode.algorithms;

public class Solution_283 {
    public void moveZeroes(int[] nums) {
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[p++] = nums[i];
            }
        }
        for (; p < nums.length; p++) {
            nums[p] = 0;
        }
    }

    public static void main(String[] args) {
        Solution_283 solution = new Solution_283();
        int[] nums = new int[]{0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
