package com.nineya.algo.leetcode.algorithms;

/**
 * @author 殇雪话诀别
 * 2021/4/17
 */
public class Solution_67 {
    public String addBinary(String a, String b) {
        char[] c1,c2;
        if (a.length() > b.length()) {
            c1 = a.toCharArray();
            c2 = b.toCharArray();
        } else {
            c1 = b.toCharArray();
            c2 = a.toCharArray();
        }
        int len1 = c1.length - 1;
        int len2 = c2.length - 1;
        boolean flag = false;
        while (len2 >= 0) {
            if (flag) {
                if (c1[len1] == '0' && c2[len2] == '0') {
                    c1[len1] = '1';
                    flag = false;
                } else if (c1[len1] != '1' || c2[len2] != '1') {
                    c1[len1] = '0';
                }
            } else {
                if (c1[len1] == '1' && c2[len2] == '1') {
                    c1[len1] = '0';
                    flag = true;
                } else if (c1[len1] != '0' || c2[len2] != '0') {
                    c1[len1] = '1';
                }
            }
            len1--;
            len2--;
        }
        while (flag && len1 >= 0) {
            if (c1[len1] == '0') {
                c1[len1] = '1';
                flag = false;
            } else {
                c1[len1] = '0';
            }
            len1--;
        }
        if (flag){
            return "1" + new String(c1);
        }
        return new String(c1);
    }

    public static void main(String[] args) {
        Solution_67 solution = new Solution_67();
        System.out.println(solution.addBinary("11", "1"));
        System.out.println(solution.addBinary("1010", "1011"));
    }
}
