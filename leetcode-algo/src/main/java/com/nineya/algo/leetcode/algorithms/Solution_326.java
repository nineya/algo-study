package com.nineya.algo.leetcode.algorithms;

public class Solution_326 {
    public boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 3 != 0) {
                return false;
            }
            n /= 3;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution_326 solution = new Solution_326();
        System.out.println(solution.isPowerOfThree(27));
        System.out.println(solution.isPowerOfThree(45));
    }
}
