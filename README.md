# 如何交通一个领域

- Chunk it up（切碎知识点）
- Deliberate practicing （刻意练习）
- Feedback （反馈）



# 数据结构和算法



# 时间和空间复杂度

- O(1) 常数复杂度
- O(log n) 对数复杂度
- O(n) 线性
- O(n^2) 平方
- O(n^3) 立方
- O(2^n) 指数
- O(n!) 阶乘  



注意：只看最高复杂度

# 数组和链表

## 数组

内存里连续的存储区域，插入、删除元素的复杂度O(n)，插入到最后一个元素，其它元素不用移动，此时为O(1)。查找为O(1)。

## 链表

查找O(n)，插入删除O(1)，但是插入、删除之前要先找到元素的位置。

## 练习：

- https://leetcode-cn.com/problems/reverse-linked-list/

  ```java
  class Solution {
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
  }
  ```

  

- 

