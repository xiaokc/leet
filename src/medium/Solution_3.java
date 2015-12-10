package medium;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Created by xkc on 8/1/15.
 */
public class Solution_3 {
    public static void main(String[] args) {
        String string = "aab";
        int len = method(string);
        System.out.println("len=" + len);
    }

    /**
     * WA
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                return map.size();
            } else {
                map.put(s.charAt(i), i);
            }
        }
        return map.size();
    }

    /**
     * 借助双指针和HashMap
     * @param s
     * @return
     */
    public static int method(String s){
        Map<Character, Integer> map = new HashMap<>();
        int rightPointer = 0;
        int leftPointer = rightPointer - 1;
        int answer = 0;
        if (s == null || s.length() == 0){
            return 0;
        }
        if (s.length() == 1){
            return 1;
        }
        while (rightPointer != s.length()){
            //put(k,v)方法返回与键值k映射关联的旧的value值
            Integer previousValue = map.put(s.charAt(rightPointer), rightPointer);

            if (previousValue != null) {
                leftPointer = Math.max(leftPointer, previousValue);
            }
            answer = Math.max(answer, rightPointer - leftPointer);
            rightPointer ++;//指针往后移动

        }
        return answer;
    }

}
