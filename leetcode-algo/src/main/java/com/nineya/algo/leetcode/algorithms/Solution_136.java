package com.nineya.algo.leetcode.algorithms;

/**
 * @author 殇雪话诀别
 * 2021/4/19
 */
public class Solution_136 {
    public int singleNumber(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[0] ^= nums[i];
        }
        return nums[0];
    }

    public static void main(String[] args) {
        Solution_136 solution = new Solution_136();
        System.out.println(solution.singleNumber(new int[]{2,2,1}));
    }
}
