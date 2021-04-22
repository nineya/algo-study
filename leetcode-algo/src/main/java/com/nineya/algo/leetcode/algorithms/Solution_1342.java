package com.nineya.algo.leetcode.algorithms;

public class Solution_1342 {
    public int numberOfSteps(int num) {
        int p = 0;
        while (num != 0) {
            p++;
            if ((num & 1) == 1) {
                num--;
            } else {
                num = num >>> 1;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        Solution_1342 solution = new Solution_1342();
        System.out.println(solution.numberOfSteps(14));
    }
}
