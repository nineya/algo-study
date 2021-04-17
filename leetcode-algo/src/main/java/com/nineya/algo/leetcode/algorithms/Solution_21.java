package com.nineya.algo.leetcode.algorithms;

import com.nineya.algo.leetcode.algorithms.assist.ListNode;
import com.sun.corba.se.impl.orbutil.LogKeywords;

/**
 * @author 殇雪话诀别
 * 2021/4/15
 */
public class Solution_21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode listNode = null;
        ListNode t = null;
        if (l1.val < l2.val) {
            listNode = l1;
            t = l1;
            l1 = l1.next;
        } else {
            listNode = l2;
            t = l2;
            l2 = l2.next;
        }
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                t.next = l2;
                return listNode;
            }
            if (l2 == null) {
                t.next = l1;
                return listNode;
            }
            if (l1.val < l2.val) {
                t.next = l1;
                t = l1;
                l1 = l1.next;
            } else {
                t.next = l2;
                t = l2;
                l2 = l2.next;
            }
        }
        return listNode;
    }

    public static void main(String[] args) {
        Solution_21 solution = new Solution_21();
        ListNode n1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode n2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode n = solution.mergeTwoLists(n1, n2);
        while (n != null) {
            System.out.print(n.val + " ");
            n = n.next;
        }
        System.out.println();
    }
}
