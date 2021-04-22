package com.nineya.algo.leetcode.algorithms;

import com.nineya.algo.leetcode.assist.TreeNode;

/**
 * @author 殇雪话诀别
 * 2021/4/18
 */

public class Solution_101 {
    private boolean doSymmetric(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null || node1.val != node2.val) {
            return false;
        }
        if (doSymmetric(node1.left, node2.right) && doSymmetric(node1.right, node2.left)) {
            return true;
        }
        return false;
    }

    public boolean isSymmetric(TreeNode root) {
        return doSymmetric(root.left, root.right);
    }

    public static void main(String[] args) {
        Solution_101 solution = new Solution_101();
        System.out.println(solution.isSymmetric(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
    }
}
