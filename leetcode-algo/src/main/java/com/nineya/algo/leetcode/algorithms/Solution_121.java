package com.nineya.algo.leetcode.algorithms;

/**
 * @author 殇雪话诀别
 * 2021/4/22
 */
public class Solution_121 {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int s = prices.length - 2;
        int e = prices.length - 1;
        int b = prices.length - 1;
        for (int i = prices.length - 3; i >= 0; i--) {
            int t = prices[i];
            b = prices[i+1]>= prices[b]?i+1:b;
            if (t <= prices[s] || prices[b] - t > prices[e] - prices[s]) {
                s = i;
                e = b;
            }
        }
        return Math.max(prices[e] - prices[s], 0);
    }

    public static void main(String[] args) {
        Solution_121 solution = new Solution_121();
        System.out.println(solution.maxProfit(new int[]{6,5,4,8,6,8,7,8,9,4,5}));
        System.out.println(solution.maxProfit(new int[]{0,3,8,6,8,6,6,8,2,0,2,7}));
        System.out.println(solution.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(solution.maxProfit(new int[]{7,6,4,3,1}));
        System.out.println(solution.maxProfit(new int[]{1, 2}));
    }
}
