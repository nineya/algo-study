package com.nineya.algo.leetcode.algorithms;

import com.nineya.algo.leetcode.assist.TreeNode;

/**
 * @author 殇雪话诀别
 * 2021/4/18
 */

public class Solution_104 {
    private int doMaxDepth(TreeNode node, int depth) {
        if (node.right == null && node.left == null) {
            return depth;
        }
        depth++;
        if (node.left != null && node.right != null) {
            return Math.max(doMaxDepth(node.left, depth), doMaxDepth(node.right, depth));
        }
        if (node.right != null) {
            return doMaxDepth(node.right, depth);
        }
        return doMaxDepth(node.left, depth);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return doMaxDepth(root, 1);
    }

    public static void main(String[] args) {
        Solution_104 solution = new Solution_104();
        System.out.println(solution.maxDepth(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
    }
}
