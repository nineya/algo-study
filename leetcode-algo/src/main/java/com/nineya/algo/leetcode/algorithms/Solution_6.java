package com.nineya.algo.leetcode.algorithms;

/**
 * @author 殇雪话诀别
 * 2021/4/15
 */
public class Solution_6 {

    public String convert(String s, int numRows) {
        if (numRows ==1) {
            return s;
        }
        char[] c = s.toCharArray();
        int l = c.length;
        char[] c2 = new char[l];
        int n = 0;
        numRows--;
        int m = numRows * 2;
        for (int i = 0; i <= numRows; i++) {
            int j = i;
            int p = i == numRows ? m : m - (i * 2);
            while (j < l) {
                c2[n++] = c[j];
                j += p;
                p = m == p ? p : m - p;
            }
        }
        return new String(c2);
    }

    public static void main(String[] args) {
        Solution_6 solution = new Solution_6();
        System.out.println(solution.convert("AB", 1));
        System.out.println(solution.convert("A", 1));
        System.out.println(solution.convert("PAYPALISHIRING", 3));
        System.out.println(solution.convert("PAYPALISHIRING", 4));
    }
}
