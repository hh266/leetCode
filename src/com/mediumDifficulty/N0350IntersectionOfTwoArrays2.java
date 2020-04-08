import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author zch
 * @description 两个数组的交集2
 * @link https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
 * @date 2020/4/7 13:51
 */
public class N0350IntersectionOfTwoArrays2 {

    public int[] intersection(int[] nums1, int[] nums2) {
        //减少空间复杂度
        if(nums1.length > nums2.length) return intersection(nums2, nums1);

        //以nums1的各个值为key，出现的次数为value。
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int num : nums1)
            map1.put(num,map1.getOrDefault(num,0)+1);

        //nums2 出现相同的数时，map对应的value -1，直到0为止。把出现的数记录到nums1
        int k = 0;
        for (int n : nums2) {
            int cnt = map1.getOrDefault(n, 0);
            if (cnt > 0) {
                nums1[k++] = n;
                map1.put(n, cnt - 1);
            }
        }

        //返回 nums1 前 k 个元素
        return Arrays.copyOfRange(nums1, 0, k);
    }
}
