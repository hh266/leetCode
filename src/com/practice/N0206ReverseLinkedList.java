package com.practice;

/**
 * @description: 反转链表
 * @link: https://leetcode-cn.com/problems/reverse-linked-list/
 * @author: zch
 * @create: 2021-04-29 22:02
 */
public class N0206ReverseLinkedList {

    /**
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode reverseHead = null;
        while(head != null){
            ListNode temp = new ListNode(head.val, head.next);
            head = head.next;
            temp.next = reverseHead.next;
            reverseHead.next = temp;
        }
        return reverseHead.next;
    }

    /**
     * 递归
     * 我子节点下的所有节点都已经反转好了，现在就剩我和我的子节点 没有完成最后的反转了，所以反转一下我和我的子节点
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }


}
