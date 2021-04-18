package com.nineya.algo.leetcode.algorithms;

import com.nineya.algo.leetcode.algorithms.assist.TreeNode;

/**
 * @author 殇雪话诀别
 * 2021/4/18
 */

public class Solution_111 {
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

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left != null && root.right != null) {
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }
        if (root.left != null) {
            return minDepth(root.left) + 1;
        }
        return minDepth(root.right) + 1;
    }

    public static void main(String[] args) {
        Solution_111 solution = new Solution_111();
        System.out.println(solution.minDepth(new TreeNode(1, new TreeNode(2), null)));
    }
}
