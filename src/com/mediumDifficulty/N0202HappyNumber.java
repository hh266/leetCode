import java.util.HashSet;

/**
 * @author zch
 * @description 快乐数
 * @link https://leetcode-cn.com/problems/happy-number/
 * @date 2020/4/7 15:24
 */
public class N0202HappyNumber {
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        int sum = squareSum(n);
        while(!set.contains(sum)){
            if(sum == 1) return true;
            set.add(sum);
            sum = squareSum(sum);
        }
        return false;
    }

    public static int squareSum(int n){
        int sum = 0;
        while(n > 0){
            sum += Math.pow((n % 10), 2);
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums =  new int[10];

    }

}
