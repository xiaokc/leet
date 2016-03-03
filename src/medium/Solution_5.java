package medium;

import java.util.ResourceBundle;

/**
 * 最长回文子串
 * Created by xkc on 12/4/15.
 */
public class Solution_5 {

    /**
     * 方法1:暴力法超时
     *
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        String ans = "";
        int length = s.length();
        int maxPalindromeLength = 0;
        //通过循环得出s的所有子串，求出长度最长的回文子串，暴力方法超时
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int subLen = j - i;
                String sub = s.substring(i, j + 1);
                if (isPalindromeString(sub)) {
                    if (subLen > maxPalindromeLength) {
                        ans = sub;
                        maxPalindromeLength = subLen;
                    }
                }
            }
        }
        return ans;
    }

    /**
     * 判断s是否是回文字符串
     *
     * @param s
     * @return
     */
    public static boolean isPalindromeString(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }


    /**
     * modified by xkc on 2/26/16
     */
    public static String method(String s) {
        String ans = "";
        int currentLength = 0;
        for (int i = 0; i < s.length(); i ++){
            if (isPalindrome(s,i - currentLength - 1, i)){
                ans = s.substring(i - currentLength - 1, i + 1);
                currentLength = currentLength + 2;
            }else if (isPalindrome(s, i - currentLength, i)){
                ans = s.substring(i - currentLength, i + 1);
                currentLength = currentLength + 1;
            }
        }
        return ans;
    }
    public static boolean isPalindrome(String s, int begin, int end){
        if (begin < 0){
            return false;
        }
        while (begin < end){
            if (s.charAt(begin ++) != s.charAt(end --)){
                return false;
            }
        }
        return true;
    }

}
