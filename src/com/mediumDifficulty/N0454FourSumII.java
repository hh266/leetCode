import java.util.HashMap;

/**
 * @author zch
 * @description 四数之和II
 * @link https://leetcode-cn.com/problems/4sum/
 * @date 2020/4/10 16:32
 */
public class N0454FourSumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int res = 0;
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();

        for(int a : A){
            for(int b : B){
                map1.put(a+b, map1.getOrDefault(a+b,0)+1);
            }
        }

        for(int c : C){
            for(int d : D){
                map2.put(c+d, map2.getOrDefault(c+d,0)+1);
            }
        }

        for(int key1 : map1.keySet()){
            if(map2.containsKey(0-key1)){
                res += map1.get(key1) * map2.get(0-key1);
            }
        }

        return res;
    }

    public int fourSumCount2(int[] A, int[] B, int[] C, int[] D) {
        int res = 0;
        HashMap<Integer,Integer> map1 = new HashMap<>();

        for(int a : A){
            for(int b : B){
                map1.put(a+b, map1.getOrDefault(a+b,0)+1);
            }
        }

        for(int c : C){
            for(int d : D){
                int flag = 0-(c+d);
                if(map1.containsKey(flag)){
                    res += map1.get(flag);
                }
            }
        }

        return res;
    }
}
