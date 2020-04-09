import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author zch
 * @description 根据字符出现频率排序
 * @link https://leetcode-cn.com/problems/sort-characters-by-frequency/
 * @date 2020/4/9 14:47
 */
public class N0451SortCharactersByFrequency {
    public String frequencySort(String s) {
        // 1.找出每个字符和它出现的频率，放到Hashmap中
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);

        // 2.将出现频率和对应的字符放到对应的数组列表中，数组的索引对应出现的频率，索引对应的列表对应该频率对应的字符
        List<Character>[] freqEles = new ArrayList[s.length() + 1];
        for (char key : map.keySet()) {
            Integer freq = map.get(key);
            if (freqEles[freq] == null) {
                freqEles[freq] = new ArrayList<>();
            }
            freqEles[freq].add(key);
        }

        // 3.根据出现的频率和对应的字符，生成最后的结果列表
        StringBuilder sb = new StringBuilder();
        for (int i = freqEles.length - 1; i >= 0; i--) {
            if (freqEles[i] == null) {
                continue;
            }
            List<Character> eles = freqEles[i];
            for (Character ele : eles) {
                for (int j = 0; j < i; j++) {
                    sb.append(ele);
                }
            }
        }
        return sb.toString();
    }
}
