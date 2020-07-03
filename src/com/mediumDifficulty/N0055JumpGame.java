import java.util.HashSet;

/**
 * @author zch
 * 跳跃游戏
 * https://leetcode-cn.com/problems/jump-game/
 * @date 2020/7/3 13:41
 */
public class N0055JumpGame {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        //能跳到最远的地方
        int farthest = 0;

        for(int i = 0; i < len; i++){
            if(farthest >= i){
                farthest = Math.max(farthest, i+nums[i]);
                if(farthest >= len - 1){
                    return true;
                }
            }
        }
        return false;
    }
}
