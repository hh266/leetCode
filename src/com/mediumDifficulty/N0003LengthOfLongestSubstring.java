/**
 * @author zch
 * @description 无重复字符的最长子串
 * @link https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * @date 2020/4/1 9:38
 */
public class N0003LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int maxLen = 0;
        for(int i = 0; i<len; i++){
            for (int j = i; j<len; j++){
                if(s.substring(i,j).indexOf(s.charAt(j)) == -1){
                    maxLen = maxLen < (j - i + 1) ? (j - i + 1) : maxLen;
                }else{
                    break;
                }
            }
        }
        return maxLen;
    }
}
