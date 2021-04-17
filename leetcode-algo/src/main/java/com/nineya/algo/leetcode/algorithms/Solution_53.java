package com.nineya.algo.leetcode.algorithms;

/**
 * @author 殇雪话诀别
 * 2021/4/17
 */
public class Solution_53 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int n = nums[0];
        for (int i = 1; i < nums.length; i++) {
            n = n < 0 ? nums[i] : n + nums[i];
            max = n > max ? n : max;
        }
        return max;
    }

    public static void main(String[] args) {
        Solution_53 solution = new Solution_53();
        System.out.println(solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(solution.maxSubArray(new int[]{-1}));
    }
}
