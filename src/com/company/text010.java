package com.company;

/**
 * leetcode 题库第027 移除元素
 * date 2019/09/22
 * link https://leetcode-cn.com/problems/remove-element/
 * desc:
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

 */
public class text010 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        removeElement(nums, 3);
        for(int i : nums){
            System.out.println(i);
        }

    }

    /**
     * 优雅的双指针法
     * 执行用时 :0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗 :35.1 MB, 在所有 Java 提交中击败了86.17%的用户
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(val != nums[j]){
                nums[i++] = nums[j];
            }
        }
        return i-1;
    }
}
