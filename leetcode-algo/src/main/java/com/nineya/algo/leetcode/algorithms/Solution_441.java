package com.nineya.algo.leetcode.algorithms;

public class Solution_441 {
    public int arrangeCoins(int n) {
        int p = (int) Math.sqrt((long) n * 2);
        if (p * (p + 1) > n * 2) {
            return p - 1;
        }
        return p;
    }

    public static void main(String[] args) {
        Solution_441 solution = new Solution_441();
        System.out.println(solution.arrangeCoins(1804289383));
        System.out.println(solution.arrangeCoins(8));
    }
}
