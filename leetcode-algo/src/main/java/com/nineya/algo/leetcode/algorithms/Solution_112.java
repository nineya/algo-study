package com.nineya.algo.leetcode.algorithms;

import com.nineya.algo.leetcode.algorithms.assist.TreeNode;

/**
 * @author 殇雪话诀别
 * 2021/4/18
 */

public class Solution_112 {
    private boolean doHasPathSum(TreeNode node, int depth, int targetSum) {
        if (node == null) {
            return false;
        }
        depth += node.val;
        if (node.left == null && node.right == null && depth == targetSum) {
            return true;
        }
        return doHasPathSum(node.left, depth, targetSum) || doHasPathSum(node.right, depth, targetSum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return doHasPathSum(root, 0, targetSum);
    }

    public static void main(String[] args) {
        Solution_112 solution = new Solution_112();
        System.out.println(solution.hasPathSum(new TreeNode(1, new TreeNode(2), new TreeNode(3)), 3));
        System.out.println(solution.hasPathSum(new TreeNode(1, new TreeNode(2), new TreeNode(3)), 5));
    }
}
