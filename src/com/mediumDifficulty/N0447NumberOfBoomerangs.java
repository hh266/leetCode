import java.util.Arrays;
import java.util.HashMap;

/**
 * @author zch
 * @description 回旋镖的数量
 * @link https://leetcode-cn.com/problems/number-of-boomerangs/
 * @date 2020/4/13 17:23
 */
public class N0447NumberOfBoomerangs {
    public static int numberOfBoomerangs(int[][] points) {
        int res = 0;
        for(int[] point1 : points){
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int[] point2 : points){
                if(Arrays.equals(point1, point2)) continue;
                int space = (point1[0] - point2[0]) * (point1[0] - point2[0]) + (point1[1] - point2[1]) * (point1[1] - point2[1]);
                map.put(space,map.getOrDefault(space,0)+1);
            }
            for(int i : map.values()){
                res += i*(i-1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(numberOfBoomerangs(new int[][] {{0,0},{1,0},{2,0}}));
    }

}
