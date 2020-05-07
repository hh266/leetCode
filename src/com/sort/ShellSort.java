package com.sort;

/**
 * 希尔排序
 * @author zch
 * @date 2020/5/7 17:53
 */
public class ShellSort {

    public static int[] shellSort(int[] arr) {
        int len = arr.length;
        int incre = len;
        while(incre != 1){
            incre = incre/2;
            for(int k = 0; k<incre; k++){
                for(int i = k + incre; i < len; i+=incre){
                    for(int j = i; j > k && arr[i] < arr[j - incre]; j-=incre ){
                        int temp = arr[i];
                        arr[j] = arr[j - incre];
                        arr[j - incre] = temp;
                    }

                }
            }
        }

        return arr;

    }

    public static void main(String[] args) {
        int[] testArr = {5, 7, 8, 9, 4, 4, 13, 2, 12, 11};
        int[] resArr = shellSort(testArr);
        for (int i : resArr) {
            System.out.println(i);
        }
    }
}
