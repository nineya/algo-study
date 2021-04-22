package com.nineya.algo.leetcode.algorithms;

public class Solution_268 {
    public int missingNumber(int[] nums) {
        int p = nums.length;
        for (int i = 0; i < nums.length; i++) {
            p ^= nums[i];
            p ^= i;
        }
        return p;
    }

    public static void main(String[] args) {
        Solution_268 solution = new Solution_268();
        System.out.println(solution.missingNumber(new int[]{3, 0, 1}));
    }
}
