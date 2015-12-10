package medium;

import java.math.BigInteger;

/**
 * NO. 43
 * Multiply Strings
 * Given two numbers represented as strings, return multiplication of the numbers as a string.
 * <p>
 * Note: The numbers can be arbitrarily large and are non-negative.
 * Created by xkc on 7/25/15.
 */
public class Solution_43 {
    public static void main(String[] args) {
        System.out.print(method("123", "100"));
    }

    /**
     * compile error 没找到BigInteger类，估计是leetcode不允许使用类BigInteger
     * @param num1
     * @param num2
     * @return
     */
    public static String multiply(String num1, String num2) {
        BigInteger b1 = new BigInteger(num1);
        BigInteger b2 = new BigInteger(num2);
       return String.valueOf(b1.multiply(b2));
    }

    /**
     * 竖式计算过程
     * @param num1
     * @param num2
     * @return
     */
    public static String method(String num1, String num2){
        int n1 = num1.length();
        int n2 = num2.length();

        int[] result = new int[n1 + n2];

        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >=0 ; j--) {
                int a1 = num1.charAt(i) - '0';
                int a2 = num2.charAt(j) - '0';
                result[i + j + 1] += a1 * a2;

            }
        }

        int carry = 0;//进位，逢十进一
        for (int i = result.length - 1; i >= 0; i--) {
            int tmp = (result[i] + carry) % 10;
            carry = (result[i] + carry) / 10;
            result[i] = tmp;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]);
        }
       while(sb.length() != 0 && sb.charAt(0) == '0') {
           sb.deleteCharAt(0);
       }

       return sb.length() == 0? "0" : sb.toString();

    }


}
