import java.util.HashMap;

/**
 * @author zch
 * @description 同构字符串
 * @link https://leetcode-cn.com/problems/isomorphic-strings/
 * @date 2020/4/8 14:01
 */
public class N205IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        //字符串长度不相等 返回false
        if(s.length() != t.length()) return false;

        //记录 s->t 的映射
        HashMap<Character,Character> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char sc = s.charAt(i);
            char st = t.charAt(i);

            if(map.containsKey(sc)){
                if(map.get(sc) != st) return false; //SC 对应的值不是 st 时
            }else{
                if(map.containsValue(st)) return false; //st 对应的 key 不是 sc 时
                map.put(sc,st); // sc st 都不存在时， 添加对应关系
            }
        }
        return true;
    }
}
