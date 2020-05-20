package com.sort;

import java.util.Arrays;

/**
 * 桶排序
 *
 * @author zch
 * @date 2020/5/20 14:45
 */
public class BucketSort {

    public int[] sort(int[] arr){
        //桶的大小
        int bucketSize = 5;

        //找出数的最大最小值
        int maxValue = arr[0];
        int minValue = arr[0];
        for(int i : arr){
            if(i < minValue){
                minValue = i;
            }else if(i > maxValue){
                maxValue = i;
            }
        }

        //计算桶的数量
        int bucketCount = (int) Math.floor((maxValue - minValue) / bucketSize) + 1;

        //初始化桶
        int[][] buckets = new int[bucketCount][0];

        // 将数据分配到各个桶中
        for (int i : arr) {
            int index = (int) Math.floor((i - minValue) / bucketSize);
            buckets[index] = arrAppend(buckets[index], i);
        }

        int arrIndex = 0;
        for (int[] bucket : buckets) {
            if (bucket.length > 0) {
                // 对每个桶进行排序，这里使用了插入排序
                bucket = InsertionSort.insertSort(bucket);
                for (int value : bucket) {
                    arr[arrIndex++] = value;
                }
            }
        }

        return arr;
    }

    /**
     * 自动扩容，并保存数据
     *
     * @param arr
     * @param value
     */
    private int[] arrAppend(int[] arr, int value) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = value;
        return arr;
    }

}
