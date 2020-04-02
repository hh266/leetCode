/**
 * @author zch
 * @description 合并两个有序数组
 * @linkhttps://leetcode-cn.com/problems/merge-sorted-array/
 * @date 2020/4/2 17:27
 */
public class N0088MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n - 1;
        int p1 = m - 1;
        int p2 = n - 1;
        while(p1 > -1 && p2 > -1){
            nums1[p1 + p2 + 1] = nums1[p1] > nums1[p2] ? nums1[p1--] : nums1[p2--];
        }
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}
