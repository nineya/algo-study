package com.nineya.algo.leetcode.algorithms;

public class Solution_231 {
    public boolean isPowerOfTwo(int n) {
        boolean flag = false;
        while ( n != 0) {
            if ((n & 1) == 1) {
                if (flag) {
                    return false;
                } else {
                    flag = true;
                }
            }
            n = n>>1;
        }
        return flag;
    }

    public static void main(String[] args) {
        Solution_231 solution = new Solution_231();
        System.out.println(solution.isPowerOfTwo(0));
        System.out.println(solution.isPowerOfTwo(1));
        System.out.println(solution.isPowerOfTwo(16));
        System.out.println(solution.isPowerOfTwo(218));
    }
}
