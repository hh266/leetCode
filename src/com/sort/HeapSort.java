package com.sort;

import java.util.Arrays;

/**
 * 堆排序（Heapsort）
 * @author zch
 * @date 2020/5/18 16:10
 */
public class HeapSort {

    public void sort(int[] arr) {
        int len = arr.length;

        //建立最大顶堆
        for (int i = (int) Math.floor(len / 2); i >= 0; i--) {
            heapify(arr, i, len);
        }

        //把最大值存在数组末尾，重新调整堆
        for (int i = len - 1; i > 0; i--) {
            swap(arr, 0, i);
            len--;
            heapify(arr, 0, len);
        }
    }

    /**
     * 调整堆
     * @param arr
     * @param i
     * @param len
     */
    private void heapify(int[] arr, int i, int len) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < len && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < len && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, len);
        }
    }

    /**
     * 交换两个坐标的值
     * @param arr
     * @param i
     * @param j
     */
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}