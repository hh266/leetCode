package com.practice;

/**
 * @description: 24. 两两交换链表中的节点
 * @url: https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 * @author: zch
 * @create: 2021-04-30 14:10
 */
public class N0024SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null){
            return head;
        }

        ListNode temp = new ListNode(0, head);
        head = head.next;

        while (temp.next != null && temp.next.next != null) {
            ListNode first = temp.next;
            ListNode second = temp.next.next;

            temp.next = second;
            first.next = second.next;
            second.next = first;

            temp = first;
        }

        return head;
    }
}
