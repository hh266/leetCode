package com.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 桶排序
 *
 * @author zch
 * @date 2020/6/2 16:55
 */
public class BucketSort {

    public static void sort(int[] arr) {
        //桶的大小
        int bucketSize = 5;
        //找出数的最大最小值
        int maxValue = arr[0];
        int minValue = arr[0];
        for (int i : arr) {
            if (i < minValue) {
                minValue = i;
            } else if (i > maxValue) {
                maxValue = i;
            }
        }
        //计算桶的数量
        int bucketCount = (int) Math.floor((maxValue - minValue) / bucketSize) + 1;
        //初始化桶 ArrayList 便于遍历， LinkedList 便于增删
        ArrayList<LinkedList<Integer>> buckets = new ArrayList<>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new LinkedList<Integer>());
        }
        //把数据装入桶
        for (int i : arr) {
            //获取元素的桶号
            int index = (int) Math.floor((i - minValue) / bucketSize);
            //使用插入排序对插入到桶内的元素进行排序
            //使用迭代器进行处理
            ListIterator<Integer> it =  buckets.get(index).listIterator();
            Boolean insertFlag = true;
            while (it.hasNext()){
                if(it.next() > i){
                    //把迭代器偏移到上一个位置
                    it.previous();
                    //把数据插入到当前位置后
                    it.add(i);
                    insertFlag = false;
                    break;
                }
            }
            //插入桶尾
            if(insertFlag){
                buckets.get(index).add(i);
            }
        }

        //把桶内数据依次取出
        int arrIndex = 0;
        for(LinkedList<Integer> bucket: buckets){
            if(bucket.size() > 0){
                for(int i : bucket){
                    arr[arrIndex++] = i;
                }
            }
        }
    }
}
