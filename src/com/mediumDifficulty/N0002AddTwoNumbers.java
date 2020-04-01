import base.ListNode;

import java.util.List;

/**
 * @author zch
 * @description 两数相加
 * @link https://leetcode-cn.com/problems/add-two-numbers/
 * @date 2020/3/24 10:46
 */
public class N0002AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = l1, q = l2, curr = head;
        int flag = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = flag + x + y;
            flag = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (flag > 0) {
            curr.next = new ListNode(flag);
        }
        return head.next;
    }

}
