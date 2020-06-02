package com.sort;

/**
 * 冒泡排序
 *
 * @author zch
 * @date 2020/5/6 16:19
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            //比较第j个元素与j+1元素的大小
            //第一轮排序后数组的最后一个元素是最大的，第二轮排序后最后两个元素依次最大
            //所有第二轮循环的次数是 arr.length-1-i
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] testArr = {5, 7, 8, 9, 4, 4, 13, 2, 12, 11};
        int[] resArr = bubbleSort(testArr);
        for (int i : resArr) {
            System.out.println(i);
        }
    }
}
