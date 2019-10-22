package com.company;

/**
 /**
 * leetcode 122. 买卖股票的最佳时机 II
 * date 2019/10/22
 * link https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 * desc:
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 *
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 *
 */
public class text014 {
    public static void main(String[] args) {

    }


    /**
     * 贪心算法
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int sum = 0;
        int flage = prices[0];
        for(int price : prices){
            if(price > flage) sum += price - flage;
            flage = price;
        }
        return sum;
    }


}
