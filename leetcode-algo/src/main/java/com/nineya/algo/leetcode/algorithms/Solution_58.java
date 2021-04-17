package com.nineya.algo.leetcode.algorithms;

/**
 * @author 殇雪话诀别
 * 2021/4/17
 */
public class Solution_58 {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int i = chars.length - 1;
        while (i >= 0 && chars[i] == ' ') {
            i--;
        }
        int n = 0;
        while (i >=0 && chars[i--] != ' ') {
            n++;
        }
        return n;
    }

    public static void main(String[] args) {
        Solution_58 solution = new Solution_58();
        System.out.println(solution.lengthOfLastWord("Hello World"));
        System.out.println(solution.lengthOfLastWord(" "));
    }
}
