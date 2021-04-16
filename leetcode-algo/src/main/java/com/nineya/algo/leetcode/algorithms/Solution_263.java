package com.nineya.algo.leetcode.algorithms;

/**
 * @author 殇雪话诀别
 * 2021/4/16
 */
public class Solution_263 {
    public boolean isUgly(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if ((n & 1) != 1){
                n = n>>1;
                continue;
            }
            if (n%3 == 0) {
                n/=3;
                continue;
            }
            if (n%5 == 0) {
                n /=5;
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution_263 solution = new Solution_263();
        System.out.println(solution.isUgly(6));
        System.out.println(solution.isUgly(8));
        System.out.println(solution.isUgly(14));
        System.out.println(solution.isUgly(1));
        System.out.println(solution.isUgly(-2147483648));
    }
}
