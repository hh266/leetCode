import java.util.HashSet;
import java.util.Set;

/**
 * @author zch
 * @description 两个数组的交集
 * @link https://leetcode-cn.com/problems/intersection-of-two-arrays/
 * @date 2020/4/7 13:51
 */
public class N0349IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        //nums1转 set集合
        HashSet<Integer> set1 = new HashSet<Integer>();
        for(int num : nums1)
            set1.add(num);

        //记录set1 与 nums2 都有的数据
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : nums2)
            if(set1.contains(num))
                set.add(num);

        //set 转 int[]
        int[] nums3 = new int[set.size()];
        int i = 0;
        for(int num :set)
            nums3[i++] = num;

        return nums3;
    }
}
