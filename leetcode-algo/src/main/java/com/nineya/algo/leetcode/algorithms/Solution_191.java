package com.nineya.algo.leetcode.algorithms;

public class Solution_191 {
    public int hammingWeight(int n) {
        int p = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                p++;
            }
            n = n >>> 1;
        }
        return p;
    }

    public static void main(String[] args) {
        Solution_191 solution = new Solution_191();
        System.out.println(solution.hammingWeight(3));
    }
}
