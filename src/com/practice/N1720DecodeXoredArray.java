package com.practice;

/**
 * @description: 解码异或后的数组
 * @url: https://leetcode-cn.com/problems/decode-xored-array/
 * @author: zch
 * @create: 2021-05-06 21:04
 */
public class N1720DecodeXoredArray {
    public int[] decode(int[] encoded, int first) {
        int len = encoded.length + 1;
        int[] arr = new int[len];
        arr[0] = first;

        for(int i = 1; i < len; i++){
            arr[i] = arr[i-1] ^ encoded[i-1];
        }

        return arr;
    }
}
