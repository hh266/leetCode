package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @description: 有效的大括号
 * @url: https://leetcode-cn.com/problems/valid-parentheses/
 * @author: zch
 * @create: 2021-05-02 23:16
 */
public class N0020ValidParentheses {

    public static boolean isValid(String s) {
        int len = s.length();
        if (len % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < len; i++){
            char ch = s.charAt(i);
            if(!pairs.containsKey(ch)){
                stack.push(ch);
            }else{
                if(stack.empty() || !stack.pop().equals(pairs.get(ch)) ){
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";

        System.out.println(s + ":" + isValid(s));
    }
}
