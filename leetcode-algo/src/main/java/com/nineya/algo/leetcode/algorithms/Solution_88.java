package com.nineya.algo.leetcode.algorithms;

/**
 * @author 殇雪话诀别
 * 2021/4/18
 */

public class Solution_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int s = m + n;
        m--;
        n--;
        while (n >= 0) {
            nums1[--s] = m < 0 || nums1[m] < nums2[n] ? nums2[n--] : nums1[m--];
        }
    }

    public static void main(String[] args) {
        Solution_88 solution = new Solution_88();
        int[] n1 = new int[]{1, 2, 3, 0, 0, 0};
        solution.merge(n1, 3, new int[]{2, 5, 6}, 3);
        for (int n : n1) {
            System.out.print(n);
        }
        System.out.println();
    }
}
