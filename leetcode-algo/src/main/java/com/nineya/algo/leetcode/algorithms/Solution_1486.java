package com.nineya.algo.leetcode.algorithms;

public class Solution_1486 {
    public int xorOperation(int n, int start) {
        int p = start;
        for (int i = 1; i < n; i++) {
            p ^= start + i * 2;
        }
        return p;
    }

    public static void main(String[] args) {
        Solution_1486 solution = new Solution_1486();
        System.out.println(solution.xorOperation(5, 0));
    }
}
