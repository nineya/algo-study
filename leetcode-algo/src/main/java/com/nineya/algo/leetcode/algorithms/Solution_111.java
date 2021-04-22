package com.nineya.algo.leetcode.algorithms;

import com.nineya.algo.leetcode.assist.TreeNode;

/**
 * @author 殇雪话诀别
 * 2021/4/18
 */

public class Solution_111 {
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
