package com.nineya.algo.leetcode.interview;

public class Solution_0506 {
    public int convertInteger(int A, int B) {
        int p = 0;
        while (A != 0 || B != 0) {
            if ((A & 1) != (B & 1)) {
                p++;
            }
            A = A >>> 1;
            B = B >>> 1;
        }
        return p;
    }

    public static void main(String[] args) {
        Solution_0506 solution = new Solution_0506();
        System.out.println(solution.convertInteger(29, 15));
    }
}
