package com.nineya.algo.leetcode.algorithms;

public class Solution_344 {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            char t = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = t;
        }

    }

    public static void main(String[] args) {
    }
}
