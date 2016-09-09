package easy;

import java.text.DecimalFormat;

/**
 * 67. Add Binary  QuestionEditorial Solution  My Submissions
 Total Accepted: 100300
 Total Submissions: 346685
 Difficulty: Easy
 Given two binary strings, return their sum (also a binary string).

 For example,
 a = "11"
 b = "1"
 Return "100".


 * Created by xkc on 9/4/16.
 */
public class Solution_67 {
    public static void main(String[] args){
        System.out.println(addBinary("11","1"));
//        System.out.println(binaryToDecimal("11"));
    }
    public static String addBinary(String a, String b) {
        int ai = binaryToDecimal(a);
        int bi = binaryToDecimal(b);

        return Integer.toBinaryString(ai+bi);
    }

    public static int binaryToDecimal(String s){
        int result = 0;
        int len = s.length();
        int carry = 1;
        for (int i = len-1; i >= 0; i --){
            result += Integer.parseInt(Character.valueOf(s.charAt(i)).toString()) * carry;
            carry = carry << 1;
        }

        return result;
    }

    public static String addBinaryBetter(String a, String b){
        if(a == null || a.isEmpty()) {
            return b;
        }
        if(b == null || b.isEmpty()) {
            return a;
        }
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        StringBuilder stb = new StringBuilder();

        int i = aArray.length - 1;
        int j = bArray.length - 1;
        int aByte;
        int bByte;
        int carry = 0;
        int result;

        while(i > -1 || j > -1 || carry == 1) {
            aByte = (i > -1) ? Character.getNumericValue(aArray[i--]) : 0;
            bByte = (j > -1) ? Character.getNumericValue(bArray[j--]) : 0;
            result = aByte ^ bByte ^ carry;
            carry = ((aByte + bByte + carry) >= 2) ? 1 : 0;
            stb.append(result);
        }
        return stb.reverse().toString();
    }
}
