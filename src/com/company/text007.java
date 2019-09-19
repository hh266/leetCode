package com.company;

import com.company.testClass.ListNode;

/**
 * leetcode 题库第二题:020有效的括号
 * date 2019/09/19
 * link https://leetcode-cn.com/problems/longest-common-prefix/
 * desc:
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * ListNode:
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) { val = x; }
 * }
 */
public class text007 {
    /**
     * 暴力解法
     * 执行用时 :1 ms, 在所有 Java 提交中击败了99.80%的用户
     * 内存消耗 :37.3 MB, 在所有 Java 提交中击败了78.85%的用户
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0);
        ListNode head = list;   //记录起点
        while (l1 != null || l2 != null){
            if(l1.val > l2.val){
                list.next = l2;
                list = list.next;
                l2 = l2.next;
            }else{
                list.next = l1;
                list = list.next;
                l1 = l1.next;
            }
        }
        list.next = l1 == null ? l2 : l1;      //没有排完的的，直接往尾部添加
        return head.next;
    }

    /**
     * 递归解法 : 先取两个队列l1、l2比较小的一个值，比较小的队列，向后移一位再比较。中断条件为一个队列为null
     * 执行用时 :1 ms, 在所有 Java 提交中击败了99.80%的用户
     * 内存消耗 :38.5 MB, 在所有 Java 提交中击败了71.39%的用户
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        if(l1.val > l2.val){
            l2.next = this.mergeTwoLists(l1, l2.next);
            return l2;
        }else{
            l1.next = this.mergeTwoLists(l2, l1.next);
            return l1;
        }

    }

}
