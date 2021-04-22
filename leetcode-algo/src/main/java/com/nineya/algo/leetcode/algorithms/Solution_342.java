package com.nineya.algo.leetcode.algorithms;

public class Solution_342 {
    public boolean isPowerOfFour(int n) {
        do{
            int t = n & 3;
            if (t == 1) {
                if (n == 1) {
                    return true;
                }
                return false;
            } else if (t != 0) {
                return false;
            }
            n = n>>>2;
        }while  (n != 0);
        return false;
    }

    public static void main(String[] args) {
        Solution_342 solution = new Solution_342();
        System.out.println(solution.isPowerOfFour(16));
        System.out.println(solution.isPowerOfFour(5));
        System.out.println(solution.isPowerOfFour(6));
        System.out.println(solution.isPowerOfFour(-2147483648));
    }
}
