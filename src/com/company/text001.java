/**
 * leetcode 题库第一题:001两数之和
 * date 2019/09/03
 * link https://leetcode-cn.com/problems/two-sum/
 */
package com.company;

public class text001 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] array = twoSum(nums,18);
        System.out.println(array[0]);
        System.out.println(array[1]);
    }

    /**
     * 暴力解法
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i< nums.length; i++){
            for(int j = i+1; j <nums.length; j++){
                if(nums[i] + nums[j] == target) return new int[] {i,j};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
