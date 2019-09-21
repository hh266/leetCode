package com.company;

/**
 * leetcode 题库第026 删除排序数组中的重复项
 * date 2019/09/21
 * link https://leetcode-cn.com/problems/maximum-number-of-balloons/
 * desc:
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。

 *
 */
public class text009 {

    public static void main(String[] args) {
        int[] array = {1,2,2,2,2,3,3,4,5};
        System.out.println(removeDuplicates(array));
        for(int i : array){
            System.out.println(i);
        }
    }

    /**
     * 双指针 非常优雅的算法
     * 执行用时 :1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗 :39.9 MB, 在所有 Java 提交中击败了95.12%的用户
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[i] != nums[j]){
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }
}
