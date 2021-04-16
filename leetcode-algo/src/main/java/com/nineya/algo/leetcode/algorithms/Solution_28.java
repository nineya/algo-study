package com.nineya.algo.leetcode.algorithms;

/**
 * @author 殇雪话诀别
 * 2021/4/17
 */
public class Solution_28 {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        char[] s =haystack.toCharArray();
        char[] s2 = needle.toCharArray();
        for (int i = 0; i <= s.length - s2.length; i++) {
            if (s[i] == s2[0]) {
                int j;
                for (j = 1; j < s2.length; j++) {
                    if (s[i + j] != s2[j]) {
                        break;
                    }
                }
                if (j == s2.length) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution_28 solution = new Solution_28();
        System.out.println(solution.strStr("hello", "ll"));
        System.out.println(solution.strStr("aaaaa", "bba"));
        System.out.println(solution.strStr("", ""));
        System.out.println(solution.strStr("a", "a"));
    }
}
