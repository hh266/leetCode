package com.company;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * leetcode 题库第二题:020有效的括号
 * date 2019/09/17
 * link https://leetcode-cn.com/problems/longest-common-prefix/
 */
public class text006 {
    public static void main(String[] args) {
        //String str = "{[]}";
        //System.out.println(str.replace("[]",""));
        System.out.println(isValid("{}"));
    }

    /**
     * 栈
     * @param s
     * @return
     */
    public static boolean isValidByStack(String s) {
        try{
            Stack<Integer> stack = new Stack<>();
            for(int i = 0; i < s.length(); i++){
                switch(s.charAt(i)){
                    case '(':
                        stack.push(1);
                        break;
                    case '[':
                        stack.push(2);
                        break;
                    case '{':
                        stack.push(3);
                        break;
                    case ')':
                        if(stack.pop() != 1) return false;
                        break;
                    case ']':
                        if(stack.pop() != 2) return false;
                        break;
                    case '}':
                        if(stack.pop() != 3) return false;
                        break;
                }
            }
            return stack.empty();
        }catch (EmptyStackException e){
            return false;
        }
    }

    /**
     * 字符串剪切 消消乐
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        while(s.indexOf("{}") > -1 || s.indexOf("[]") > -1 || s.indexOf("()") > -1){
            s=s.replace("{}","");
            s=s.replace("[]","");
            s=s.replace("()","");
        }
        return s.isEmpty();
    }


}
