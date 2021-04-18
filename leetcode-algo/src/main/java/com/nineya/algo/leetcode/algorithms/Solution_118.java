package com.nineya.algo.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 殇雪话诀别
 * 2021/4/18
 */

public class Solution_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        if (numRows > 0) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            lists.add(list);
        }
        for (int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            List<Integer> test = lists.get(i - 1);
            list.add(1);
            for (int j = 1; j < i; j++) {
                list.add(test.get(j - 1) + test.get(j));
            }
            list.add(1);
            lists.add(list);
        }
        return lists;
    }

    public static void main(String[] args) {
        Solution_118 solution = new Solution_118();
        List<List<Integer>> lists = solution.generate(5);
        for (List<Integer> list : lists) {
            for (Integer num : list) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
