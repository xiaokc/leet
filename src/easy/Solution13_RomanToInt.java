package easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * roman to integer
 * Created by xkc on 12/14/15.
 */
public class Solution13_RomanToInt {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = getRomanMap();

        char[] chars = s.toCharArray();
        int num = 0;
        for (int i = 0; i < chars.length; i ++){
            if (i + 1 < chars.length && map.get(chars[i]) < map.get(chars[i+1])){
                num -= map.get(chars[i]);
            }else {
                num += map.get(chars[i]);
            }
        }
        return num;
    }

    public static Map<Character, Integer> getRomanMap() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        return map;
    }

}
