import java.util.HashMap;

/**
 * @author zch
 * @description 有效的字母异位词
 * @link https://leetcode-cn.com/problems/valid-anagram/
 * @date 2020/4/8 10:40
 */
public class N0242ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            map.put(c1,map.getOrDefault(c1,0)+1);
        }

        for (int j = 0; j < t.length(); j++){
            char c2 = t.charAt(j);
            if(map.containsKey(c2)){
                int cnt = map.getOrDefault(c2, 0);
                if(cnt == 1){
                    map.remove(c2);
                }else if (cnt > 1) {
                    map.put(c2,cnt-1);
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }

        return map.isEmpty();
    }
}
