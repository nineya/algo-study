package com.nineya.algo.leetcode.algorithms;

/**
 * @author 殇雪话诀别
 * 2021/4/17
 */
public class Solution_35 {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int t = nums.length - 1;
        while (s < t) {
            int n = (s + t) / 2;
            if (nums[n] == target) {
                return n;
            }
            if (nums[n] < target) {
                s = n + 1;
            } else {
                t = n - 1;
            }
        }
        if (nums[s] < target) {
            return s + 1;
        }
        return s;
    }

    public static void main(String[] args) {
        Solution_35 solution = new Solution_35();
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 7));
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 0));
    }
}
