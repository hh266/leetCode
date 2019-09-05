package com.company;

/**
 * leetcode 题库第二题:009回文数
 * date 2019/09/05
 * link https://leetcode-cn.com/problems/reverse-integer/
 */
public class text003 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    /**
     * 数学解法
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        if(x < 0) return false;                 //负数直接false

        if(x >= 0 && x<10) return true;         //个位数直接true

        int temp = x;
        int y = 0;
        while (x != 0){                         //反转过程 参考整数反转 不需要考虑溢出
            int pop = x % 10;
            y = y * 10 +  pop;
            x = (x - pop) / 10;
        }

        return temp == y;
    }
}
