package medium;

/**
 * 判断是否是回文数
 * Palindrome number
 * Created by xkc on 8/1/15.
 */
public class Solution {
    public static void main(String[] args) {

        boolean b = method_1(12321);
        System.out.print("b = "+b);
    }

    /**
     * 已AC，but,借助字符串，，使用了额外的空间
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String xStr = String.valueOf(x);
        StringBuilder sb = new StringBuilder(xStr);
        if (sb.reverse().toString().equals(xStr)){
            return true;
        }

        return false;
    }


    /**
     * 已AC，but没有考虑溢出的情况
     * reverse integer可能会overflow
     * @param x
     * @return
     */
    public static boolean method_1(int x){
        int y = 0;
        int tmp = x;
        if (x < 0){
            return false;
        }
        while (x != 0){
            y = y * 10 + x % 10;//数字逆转
            x /= 10;
        }
        if (y == tmp){
            return true;
        }
        return false;
    }



    public static boolean methd_2(int x){
        if (x < 0){
            return false;
        }
        int length = String.valueOf(x).length();
        while (length != 0){
            
        }
        return false;
    }

}
