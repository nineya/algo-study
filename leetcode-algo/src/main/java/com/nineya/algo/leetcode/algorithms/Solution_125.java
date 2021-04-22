package com.nineya.algo.leetcode.algorithms;

public class Solution_125 {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        int p = 'A' - 'a';
        while (i < j) {
            char c1 = chars[i];
            while ((c1 < 'a' || c1 > 'z') && (c1 < 'A' || c1 > 'Z') && (c1 < '0' || c1 > '9')) {
                if (i >= j) {
                    break;
                }
                c1 = chars[++i];
            }
            if (c1 >= 'A' && c1 <= 'Z') {
                c1 -= p;
            }
            char c2 = chars[j];
            while ((c2 < 'a' || c2 > 'z') && (c2 < 'A' || c2 > 'Z') && (c2 < '0' || c2 > '9')) {
                if (i >= j) {
                    break;
                }
                c2 = chars[--j];
            }
            if (c2 >= 'A' && c2 <= 'Z') {
                c2 -= p;
            }
            if (c2 != c1) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution_125 solution = new Solution_125();
        System.out.println(solution.isPalindrome("a."));
        System.out.println(solution.isPalindrome("0P"));
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(solution.isPalindrome("race a car"));
    }
}
