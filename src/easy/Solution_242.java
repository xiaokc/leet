package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * valid anagram有效的字谜，判断两个字符串是由相同的字母组成
 * Created by xkc on 12/13/15.
 */
public class Solution_242 {

    //通过hashmap进行比较
    public static boolean isAnagram(String s, String t) {

        if (s.equals("") && t.equals("")) {
            return true;
        }

        if (s.length() != t.length()) {
            return false;
        }


        Map<Character, Integer> mapS = getMap(s);

        for (int i = 0; i < t.length(); i ++) {
            char c = t.charAt(i);
            if (!mapS.containsKey(c)) {
                return false;
            }

            mapS.put(c,mapS.get(c)-1);
        }

        for (int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);
            if (mapS.get(c) < 0){
                return false;
            }
        }

        return true;

    }

    //通过排序进行比较
    public static boolean isAnagram2(String s, String t){
        if (s.length() != t.length()) {
            return false;
        }
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        return String.valueOf(ss).equals(String.valueOf(tt));
    }

    public static Map<Character, Integer> getMap(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        return map;
    }

}
