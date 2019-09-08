package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode 题库第二题:013罗马数字转整数
 * date 2019/09/06
 * link https://leetcode-cn.com/problems/roman-to-integer/
 */
public class text004 {
    public static void main(String[] args) {
        System.out.println(romanToInt2("IV"));
    }

    /**
     * 直接逻辑判断
     * 逻辑清晰易于理解，但是代码冗余过多，不利于扩展。
     * @param s
     * @return
     */
    public static int romanToInt(String s) {
        int number = 0;
        for(int i = 0; i < s.length(); i++){
            switch( s.charAt(i)){
                case 'I':
                    if(i+1 < s.length() && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')){
                        number += -1;
                    }else{
                        number += 1;
                    }
                    break;
                case 'V':
                    number += 5;
                    break;
                case 'X':
                    if (i+1 < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                        number += -10;
                    }else {
                        number += 10;
                    }
                    break;
                case 'L':
                    number += 50;
                    break;
                case 'C':
                    if ( i+1 < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                        number += -100;
                    } else {
                        number += 100;
                    }
                    break;
                case 'D':
                    number += 500;
                    break;
                case 'M':
                    number += 1000;
                    break;
            }
        }
        return number;
    }

    /**
     * HashMap
     * 把基础的罗马数字添加到HashMap中，遍历字符串，同时分别取出后面两位的对应整数，判断如果后面位数的值比前面的值小，那么就在总数上加上前面的数值，否则就减去前面的数值
     * @param s
     * @return
     */
    public static int romanToInt2(String s) {
        Map<Character,Integer> romaNumber = new HashMap<>();
        romaNumber.put('I', 1);
        romaNumber.put('V', 5);
        romaNumber.put('X', 10);
        romaNumber.put('L', 50);
        romaNumber.put('C', 100);
        romaNumber.put('D', 500);
        romaNumber.put('M', 1000);

        int firstValue = 0;
        int nextValue = 0;
        int sum = 0;

        for (int i = 0; i < s.length(); i++){
            firstValue = romaNumber.get(s.charAt(i));
            if (i == s.length()-1){
                sum += firstValue;
            }else {
                nextValue = romaNumber.get(s.charAt(i+1));
                if (firstValue >= nextValue){
                    sum += firstValue;
                }else{
                    sum -= firstValue;
                }
            }
        }
        return sum;
    }
}
