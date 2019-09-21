package com.company;

/**
 * leetcode 题库第二题: 1189. “气球” 的最大数量
 * date 2019/09/20
 * link https://leetcode-cn.com/problems/maximum-number-of-balloons/
 * desc:
 *  给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。
 *  字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。
 *
 *  示例 1：
 * 输入：text = "nlaebolko"
 * 输出：1
 *
 * 示例 2：
 * 输入：text = "loonbalxballpoon"
 * 输出：2
 * 示例 3：
 *
 * 输入：text = "leetcode"
 * 输出：0
 */
public class text008 {

    public static void main(String[] args) {
        String text = "loonbalxballpoon";
        System.out.println(maxNumberOfBalloons(text));
    }

    public static int maxNumberOfBalloons(String text) {
        int numB = 0;
        int numA = 0;
        int numL = 0;
        int numO = 0;
        int numN = 0;
        int min = 0;

        for(int i = 0; i < text.length(); i++){
            switch(text.charAt(i)){
                case 'b':
                    numB++;
                    break;
                case 'a':
                    numA++;
                    break;
                case 'l':
                    numL++;
                    break;
                case 'o':
                    numO++;
                    break;
                case 'n':
                    numN++;
                    break;

            }
        }

        //b a l o n 最小出现的次数就是 最多能拼的balloon数。 其中l和o是出现两次，计算时要除2
        min = numB < numA ? numB:numA;
        min = min < numL/2 ? min : numL/2;
        min = min < numO/2 ? min : numO/2;
        min = min < numN ? min : numN;
        return min;

    }


    /*public static String reverseParentheses(String s) {
        if(s.indexOf("(") == -1)
            return s;

        int indexLeft = s.indexOf("(") <  s.indexOf(")") ? s.indexOf("(") : s.indexOf(")");
        int indexRight = s.lastIndexOf(")") > s.lastIndexOf("(") ? s.lastIndexOf(")") : s.lastIndexOf("(") ;

        return s.substring(0,indexLeft) + reverseParentheses(new StringBuffer(s.substring(indexLeft+1, indexRight)).reverse().toString()) + s.substring(indexRight+1);

    }*/
}
