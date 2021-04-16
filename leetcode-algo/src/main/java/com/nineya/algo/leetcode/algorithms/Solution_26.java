package com.nineya.algo.leetcode.algorithms;

/**
 * @author 殇雪话诀别
 * 2021/4/17
 */
public class Solution_26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int n = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[n]) {
                nums[++n] = nums[i];
            }
        }
        return n + 1;
    }

    public static void main(String[] args) {
        Solution_26 solution = new Solution_26();
        System.out.println(solution.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
