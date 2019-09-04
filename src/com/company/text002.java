/**
 * leetcode 题库第二题:007整数反转
 * date 2019/09/03
 * link https://leetcode-cn.com/problems/reverse-integer/
 */
package com.company;

public class text002 {
    public static void main(String[] args) {
        System.out.println(reverse(123456789));
    }

    /**
     * 数学解法
     * 需要注意int的取值范围和结果是否会溢出
     * @param x
     * @return
     */
    public static int reverse(int x) {
        int y = 0;
        while (x != 0){
            int pop = x%10;
            if( y > Integer.MAX_VALUE/10 || y < Integer.MIN_VALUE/10 || (y == Integer.MAX_VALUE/10 && pop >7) || (y == Integer.MIN_VALUE/10 && pop < -8)) return 0;
            y = y * 10 +  pop;
            x = (x - pop)/10;
        }
        return y;
    }

}
