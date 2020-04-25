package com.sort;


/**
 * @name: MergeSort
 * @description: 归并排序
 * @author: zch
 * @create: 2020-04-25 22:10
 */
public class MergeSort {

    /**
     * 排序方法
     * @param nums 待排序数组
     * @param l 开始下标
     * @param h 节俗下标
     * @return
     */
    public static int[] mergeSort(int[] nums, int l, int h) {
        if (l == h){
            return new int[] { nums[l] };
        }


        int mid = l + (h - l) / 2;
        //左有序数组
        int[] leftArr = mergeSort(nums, l, mid);
        //右有序数组
        int[] rightArr = mergeSort(nums, mid + 1, h);
        //新有序数组
        int[] newNum = new int[leftArr.length + rightArr.length];

        //合并两个有序数组为一个有序数组
        int m = 0, i = 0, j = 0;
        while (i < leftArr.length && j < rightArr.length) {
            newNum[m++] = leftArr[i] < rightArr[j] ? leftArr[i++] : rightArr[j++];
        }
        while (i < leftArr.length){
            newNum[m++] = leftArr[i++];
        }
        while (j < rightArr.length){
            newNum[m++] = rightArr[j++];
        }

        return newNum;
    }
    public static void main(String[] args) {
        int[] nums = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 10 };
        int[] newNums = mergeSort(nums, 0, nums.length - 1);
        for (int x : newNums) {
            System.out.println(x);
        }
    }
}
