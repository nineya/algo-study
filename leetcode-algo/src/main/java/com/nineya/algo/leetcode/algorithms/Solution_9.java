package com.nineya.algo.leetcode.algorithms;

/**
 * @author 殇雪话诀别
 * 2021/4/16
 */
public class Solution_9 {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int s = x;
        int y = 0;
        while (s != 0) {
            y *= 10;
            y += s % 10;
            s /= 10;
        }
        return x == y;
    }

    public static void main(String[] args) {
        Solution_9 solution = new Solution_9();
        System.out.println(solution.isPalindrome(121));
        System.out.println(solution.isPalindrome(-121));
        System.out.println(solution.isPalindrome(10));
        System.out.println(solution.isPalindrome(0));
    }
}
