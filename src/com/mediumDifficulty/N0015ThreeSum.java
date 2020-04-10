import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zch
 * @description 三数之和
 * @link https://leetcode-cn.com/problems/3sum/
 * @date 2020/4/9 16:44
 */
public class N0015ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int k = 0; k < nums.length - 2; k++){
            if(nums[k] > 0)  break;
            if(k > 0 && nums[k-1] == nums[k]) continue;
            int i = k+1; int j = nums.length - 1;
            while(i < j){
                int sum = nums[k] + nums[i] + nums[j];
                if(sum == 0){ // 记录，i 右移，j左移。
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[k], nums[i], nums[j])));
                    while(i < j && nums[i] == nums[++i]); //跳过重复的值，左移 +1 ，右移 -1 。
                    while(i < j && nums[j] == nums[--j]);
                }else if(sum > 0){//j左移。
                    while(i < j && nums[j] == nums[--j]);
                }else{//i 右移。
                    while(i < j && nums[i] == nums[++i]);
                }
            }
        }
        return res;
    }
}
