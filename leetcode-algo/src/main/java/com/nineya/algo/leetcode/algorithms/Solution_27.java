package com.nineya.algo.leetcode.algorithms;

/**
 * @author 殇雪话诀别
 * 2021/4/17
 */
public class Solution_27 {
    public int removeElement(int[] nums, int val) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] !=val) {
                nums[n++] = nums[i];
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Solution_27 solution = new Solution_27();
        System.out.println(solution.removeElement(new int[]{3,2,2,3}, 3));
        System.out.println(solution.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }
}
