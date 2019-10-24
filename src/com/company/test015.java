package com.company;

/**
 * leetcode 66. 加一
 * date 2019/09/24
 * link https://leetcode-cn.com/problems/plus-one/
 * desc:
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 *
 */
public class test015 {

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len -1; i >= 0; i--){
            digits[i] = (digits[i] + 1) % 10;
            if(digits[i] != 0) return digits;
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }
}
