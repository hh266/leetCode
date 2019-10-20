package com.company;

/**
 * leetcode 题库第53. 最大子序和
 * date 2019/10/16
 * link https://leetcode-cn.com/problems/maximum-subarray/
 * desc:
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 示例:
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class text012 {

    public static void main(String[] args) {
        int[] nums = {-2,-1,-3,-4,-1,-2,-1,-5,-4};
        System.out.println(maxSubArray(nums));
    }

    /**
     * 动态规划法
     * 执行用时 :1 ms, 在所有 java 提交中击败了99.97%的用户
     * 内存消耗 :37.5 MB, 在所有 java 提交中击败了89.77%的用户
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for(int num : nums){
            sum = sum < 0 ? num : sum + num;
            max = max > sum ? max : sum;
        }
        return max;
    }
}
