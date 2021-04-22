package com.nineya.algo.leetcode.algorithms;

public class Solution_476 {
    public int findComplement(int num) {
        int p = 1;
        while (p < num) {
            p = (p << 1) + 1;
        }
        return num ^ p;
    }

    public static void main(String[] args) {
        Solution_476 solution = new Solution_476();
        System.out.println(solution.findComplement(5));
        System.out.println(solution.findComplement(1));
    }
}
