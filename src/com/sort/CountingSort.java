package com.sort;

/**
 * 计数排序
 * @author zch
 * @date 2020/5/19 16:44
 */
public class CountingSort {
    public int[] sort(int[] arr){

        //获取待排序数组的最大值
        int maxValue = arr[0];
        for(int i : arr){
            if(maxValue < i){
                maxValue = i;
            }
        }

        //新建一个 length 为 maxValue+1 的数组，统计 arr 数组中每个值出现的次数。
        //0 到 maxValue 之间有 maxValue+1 个值。
        int[] countingArr = new int[maxValue + 1];
        for(int i : arr){
            //int 类型的默认值为0
            countingArr[i] ++;
        }

        //把统计的值统计依次赋予给原数组
        int sortedIndex = 0;
        for(int i = 0; i < maxValue + 1; i++){
            while(countingArr[i] > 0){
                arr[sortedIndex++] = i;
                countingArr[i]--;
            }
        }

        return arr;
    }
}
