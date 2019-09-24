package com.company;

/**
 * leetcode 35. 搜索插入位置
 * date 2019/09/24
 * link https://leetcode-cn.com/problems/search-insert-position/
 * desc:
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
*
 */
public class text011 {
    public static void main(String[] args) {

    }

    /**
     * 暴力解法
     * 执行用时 : 0 ms, 在所有 Java 提交中击败了 100.00%的用户
     * 内存消耗 :38.5 MB , 在所有 Java 提交中击败了 63.11%的用户
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        for(; i < nums.length; i++){
            if(target <= nums[i]){
                return i;
            }
        }
        return i + 1;
    }

    /**
     * 二分法
     *执行用时 :0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗 : 39.1 MB, 在所有 Java 提交中击败了52.00%的用户
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert1(int[] nums, int target) {
        int le = nums.length;
        if(nums[le -1] < target)   return le;

        int left = 0;
        int right = le-1;

        while(left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
