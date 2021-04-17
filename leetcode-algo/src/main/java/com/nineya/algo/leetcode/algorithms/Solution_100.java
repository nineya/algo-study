package com.nineya.algo.leetcode.algorithms;

import com.nineya.algo.leetcode.algorithms.assist.TreeNode;

/**
 * @author 殇雪话诀别
 * 2021/4/18
 */

public class Solution_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || (p.val != q.val)) {
            return false;
        }
        if (isSameTree(p.left, q.left) && isSameTree(p.right, q.right)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution_100 solution = new Solution_100();
        System.out.println(solution.isSameTree(new TreeNode(1, new TreeNode(2), new TreeNode(3)),
                new TreeNode(1, new TreeNode(2), new TreeNode(3))));
    }
}
