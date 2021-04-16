package com.nineya.algo.leetcode.algorithms;

/**
 * @author 殇雪话诀别
 * 2021/4/16
 */
public class Solution_38 {
    byte[] s = new byte[4481];
    byte[] s2 = new byte[4481];
    public String countAndSay(int n) {
        s[0] = 1;
        for (int i = 1; i < n; i++){
            int j = 0;
            int k = 0;
            while (s[k] != 0) {
                byte p = s[k++];
                byte q = 1;
                while (s[k] == p) {
                    q++;
                    k++;
                }
                s2[j++] = q;
                s2[j++] = p;
            }
            s2[j] = 0;
            byte[] t = s;
            s = s2;
            s2 = t;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4481; i ++) {
            if (s[i] == 0) {
                break;
            }
            sb.append(s[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution_38 solution = new Solution_38();
        System.out.println(solution.countAndSay(1));
        System.out.println(solution.countAndSay(4));
        System.out.println(solution.countAndSay(5));
        System.out.println(solution.countAndSay(30));
    }
}
