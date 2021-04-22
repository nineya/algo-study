package com.nineya.algo.leetcode.algorithms;

import com.nineya.algo.leetcode.assist.ListNode;

/**
 * @author 殇雪话诀别
 * 2021/4/18
 */

public class Solution_83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        int n = head.val;
        ListNode node = head;
        ListNode node2 = head;
        while (node != null) {
            if (node.val != n) {
                node2.next = node;
                node2 = node;
                n = node.val;
            }
            node = node.next;
        }
        node2.next = null;
        return head;
    }

    public static void main(String[] args) {
        Solution_83 solution = new Solution_83();
        ListNode n1 = new ListNode(1, new ListNode(1, new ListNode(1)));
        ListNode n = solution.deleteDuplicates(n1);
        while (n != null) {
            System.out.print(n.val + " ");
            n = n.next;
        }
    }
}
