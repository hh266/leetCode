import java.util.HashMap;
import java.util.HashSet;

/**
 * @author zch
 * @description 存在重复元素 II
 * @link https://leetcode-cn.com/problems/contains-duplicate-ii/
 * @date 2020/4/14 17:33
 */
public class N0219ContainsDuplicateII {

    /**
     * 我的解题： https://leetcode-cn.com/problems/contains-duplicate-ii/solution/java-9ms-hua-dong-chuang-kou-by-123456-18/
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length < 2 || k < 1) return false;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++ ){
           if(set.contains(nums[i])){
               return true;
           }else{
               //  相当于 set.size() > k
               if(i >= k){
                   set.remove(nums[i-k]);
               }
               set.add(nums[i]);
           }
        }
        return false;
    }

}
