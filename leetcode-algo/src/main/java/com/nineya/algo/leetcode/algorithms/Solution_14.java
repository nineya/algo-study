package com.nineya.algo.leetcode.algorithms;

/**
 * @author 殇雪话诀别
 * 2021/4/16
 */
public class Solution_14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        char[] chars = strs[0].toCharArray();
        int n = chars.length;
        for (int i = 1; i < strs.length; i++) {
            char[] c = strs[i].toCharArray();
            if (n == 0) {
                return "";
            }
            n = Math.min(n, c.length);
            for (int j = 0; j < n; j++) {
                if (chars[j] != c[j]) {
                    n = j;
                }
            }
        }
        return strs[0].substring(0, n);
    }

    public static void main(String[] args) {
        Solution_14 solution = new Solution_14();
        System.out.println(solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }
}
