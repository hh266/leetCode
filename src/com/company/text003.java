package com.company;

/**
 * leetcode 题库第二题:009回文数
 * date 2019/09/05
 * link https://leetcode-cn.com/problems/reverse-integer/
 */
public class text003 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }

    /**
     * 数学解法
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x >= 0 && x<10) return true;

        int y = 0;
        while (x != 0){
            int pop = x % 10;
            y = y * 10 +  pop;
            x = (x - pop) / 10;
        }


        return x == y;
    }
}
