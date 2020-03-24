package com.company;

/**
 * https://leetcode-cn.com/problems/sqrtx/
 * 69. x 的平方根
 *
 * 实现 int sqrt(int x) 函数。
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 */
public class test018 {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        if (x <= 3) return 1;

        int left = 1;
        int right = x/2;
        while(right <= left){
            if(right*right > x){
                right = (right+left)/2;
            }else{
                return right;
            }
        }
        return  1;
    }
}
