package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Excel Sheet Column Number
 * Created by xkc on 12/14/15.
 */
public class Solution_171 {
    //Excel 表列计算，等价于26进制计算
    public static int titleToNumber(String s) {
        int n = s.length();
        int num = 0;
        Map<Character,Integer> map = new HashMap<>();
        int v = 1;
        for (char c='A';c <= 'Z';c ++){
            map.put(c,v ++);
        }
        for (int i = 0; i < n; i ++){
            char c = s.charAt(i);
            int cint = map.get(c);
            num += cint * Math.pow(26,n - i - 1);

        }

        return num;

    }


    public static int tittleToNumber2(String s){
        int num = 0;
        for (int i = 0; i < s.length(); i ++){
            num = 26 * num + (s.charAt(i) - 'A') + 1;
        }
        return num;
    }

}
