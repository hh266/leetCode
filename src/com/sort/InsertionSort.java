package com.sort;

/**
 * 插入排序
 *
 * @author zch
 * @date 2020/4/15 15:21
 */
public class InsertionSort {
    public static int[] insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] testArr = {5, 7, 8, 9, 4, 4, 13, 2, 12, 11};
        int[] resArr = insertSort(testArr);
        for (int i : resArr) {
            System.out.println(i);
        }
    }
}
