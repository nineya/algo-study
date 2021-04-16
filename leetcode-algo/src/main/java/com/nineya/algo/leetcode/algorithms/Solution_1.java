package com.nineya.algo.leetcode.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 殇雪话诀别
 * 2021/4/16
 */
public class Solution_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return new int[]{0, 1};
    }

    public static void main(String[] args) {
        Solution_1 solution = new Solution_1();
        int[] a = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(a[0] + " " + a[1]);
        a = solution.twoSum(new int[]{3, 2, 4}, 6);
        System.out.println(a[0] + " " + a[1]);
    }
}
