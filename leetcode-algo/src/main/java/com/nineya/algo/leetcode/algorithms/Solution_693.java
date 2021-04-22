package com.nineya.algo.leetcode.algorithms;

public class Solution_693 {
    public boolean hasAlternatingBits(int n) {
        int s = n & 3;
        if (s != 1 && s != 2) {
            return false;
        }
        n = n >>> 2;
        while (n != 0) {
            if ((n & 3) != s) {
                return false;
            }
            n = n >>> 2;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution_693 solution = new Solution_693();
        System.out.println(solution.hasAlternatingBits(5));
        System.out.println(solution.hasAlternatingBits(7));
    }
}
