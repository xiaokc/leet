package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Reverse Vowels of a String
 * Created by xkc on 8/3/16.
 */
public class Solution_345 {
    public static void main(String[] args){
        String s = "apG0i4maAs::sA0m4i0Gp0";
        System.out.println(reverseVowels(s));
    }
    private static final char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
    public static String reverseVowels(String s) {
        Map<Integer,Character> vowelsMap = getMap(vowels);
        char[] chars = s.toCharArray();
        int head = 0;
        int tail = s.length() - 1;

        for (int i = 0; i < chars.length / 2; i ++){
            if (head >= tail){
                return String.valueOf(chars);
            }
            while (head < tail  && !vowelsMap.containsValue(chars[head])){
                head ++;
            }
            while (head < tail  && ! vowelsMap.containsValue(chars[tail])){
                tail --;
            }

            if (vowelsMap.containsValue(s.charAt(head)) && vowelsMap.containsValue(s.charAt(tail))){
                char tmp = chars[head];
                chars[head] = chars[tail];
                chars[tail] = tmp;

                head ++;
                tail --;
            }
        }

        return String.valueOf(chars);

    }

    public static Map<Integer,Character> getMap(char[] vowels){
        Map<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < vowels.length; i ++){
            map.put(i,vowels[i]);
        }

        return map;
    }
}
