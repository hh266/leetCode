package com.practice;

/**
 * @description: Definition for singly-linked list
 * @author: zch
 * @create: 2021-04-29 22:06
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
