package com.nineya.algo.leetcode.algorithms;

public class Solution_190 {
    public int reverseBits(int n) {
        int p = 0;
        for (int i = 0; i < 32; i++) {
            p = p << 1;
            p |= (n & 1);
            n = n >>> 1;
        }
        return p;
    }

    public static void main(String[] args) {
        Solution_190 solution = new Solution_190();
        System.out.println(solution.reverseBits(43261596));
    }
}
