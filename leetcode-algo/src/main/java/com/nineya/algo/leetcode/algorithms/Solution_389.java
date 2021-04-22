package com.nineya.algo.leetcode.algorithms;

public class Solution_389 {
    public char findTheDifference(String s, String t) {
        char[] chars = s.toCharArray();
        int p = 0;
        for (char c : chars) {
            p ^= c;
        }
        chars = t.toCharArray();
        for (char c : chars) {
            p ^= c;
        }
        return (char) p;
    }

    public static void main(String[] args) {
        Solution_389 solution = new Solution_389();
        System.out.println(solution.findTheDifference("abcd", "abcde"));
        System.out.println(solution.findTheDifference("aa", "a"));
    }
}
