package com.sort;

/**
 * @author zch
 * @date 2020/5/18 16:19
 */
public class test {
    public static void main(String[] args) throws Exception {
        int[] testArr = {5, 7, 8, 9, 4, 4, 13, 2, 12, 11};
        HeapSort heapSort = new HeapSort();

        int[] resArr = heapSort.sort(testArr);

        for (int i : resArr) {
            System.out.println(i);
        }
    }
}