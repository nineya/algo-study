package com.nineya.algo.leetcode.algorithms;

/**
 * @author 殇雪话诀别
 * 2021/4/17
 */
public class Solution_69 {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int s = 0;
        int t = x;
        while(t - s > 1) {
            int k = (s + t) / 2;
            int q = x/k;
            if (q < k) {
                t = k;
            } else if (q > k) {
                s = k;
            } else {
                return k;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Solution_69 solution = new Solution_69();
        System.out.println(solution.mySqrt(2147483647));
        System.out.println(solution.mySqrt(8));
        System.out.println(solution.mySqrt(2147395599));
        System.out.println(solution.mySqrt(5));
        System.out.println(solution.mySqrt(1));
        System.out.println(solution.mySqrt(4));
    }
}
