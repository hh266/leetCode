import java.util.HashSet;

/**
 * @author zch
 * @description 存在重复元素 III
 * @link https://leetcode-cn.com/problems/contains-duplicate-iii/
 * @date 2020/4/15 11:45
 */
public class N0220ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums.length < 2 || k < 1) return false;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j : set) {
                long temp = (long) nums[i] - j;
                if (-t <= temp && temp <= t) {
                    return true;
                }
            }
            if (i >= k) {
                set.remove(nums[i - k]);
            }
            set.add(nums[i]);
        }
        return false;
    }
}
