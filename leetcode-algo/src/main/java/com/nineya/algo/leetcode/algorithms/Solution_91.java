package com.nineya.algo.leetcode.algorithms;

/**
 * @author 殇雪话诀别
 * 2021/4/22
 */
public class Solution_91 {
    public int numDecodings(String s) {
        char[] chars = s.toCharArray();
        int n1 = 1;
        if (chars[0] == '0') {
            return 0;
        }
        if (chars.length == 1) {
            return 1;
        }
        int n2 = 1;
        if (chars[1] == '0') {
            if (chars[0] > '2') {
                return 0;
            }
        } else if (chars[0] == '1' || (chars[0] == '2' && chars[1] <= '6')){
            n2++;
        }
        for (int i = 2; i < chars.length; i++) {
            if(chars[i] == '0') {
                if (chars[i - 1] == '0' || chars[i - 1] > '2') {
                    return 0;
                }
                int t = n2;
                n2 = n1;
                n1 = t;

            } else if (chars[i - 1] == '1' || (chars[i - 1] == '2' && chars[i] <= '6')) {
                int t = n1;
                n1 = n2;
                n2 += t;
            } else {
                n1 = n2;
            }
        }
        return n2;
    }

    public static void main(String[] args) {
        Solution_91 solution = new Solution_91();
        System.out.println(solution.numDecodings("2611055971756562"));
        System.out.println(solution.numDecodings("10011"));
        System.out.println(solution.numDecodings("1201234"));
        System.out.println(solution.numDecodings("2101"));
        System.out.println(solution.numDecodings("12"));
        System.out.println(solution.numDecodings("226"));
        System.out.println(solution.numDecodings("0"));
        System.out.println(solution.numDecodings("06"));
    }
}
