package com.nineya.algo.leetcode.algorithms;

public class Solution_405 {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int s = num & 15;
            if (s < 10) {
                sb.insert(0, s);
            } else {
                sb.insert(0, (char)('a' + s - 10));
            }
            num >>>= 4;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution_405 solution = new Solution_405();
        System.out.println(solution.toHex(26));
    }
}
