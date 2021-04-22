package com.nineya.algo.leetcode.algorithms;

import java.util.Arrays;

public class Solution_164 {
    public int maximumGap(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        Arrays.sort(nums);
        int p = nums[1] - nums[0];
        for (int i = 2; i < nums.length; i++) {
            p = Math.max(nums[i] - nums[i - 1], p);
        }
        return p;
    }

    public static void main(String[] args) {
        Solution_164 solution = new Solution_164();
        System.out.println(solution.maximumGap(new int[]{0, 1, 0, 3, 12}));
    }
}
