package easy;

/**
 * Plus one
 * 一个整数按位存储在一个数字的数组，加上1
 * Created by xkc on 7/27/15.
 */
public class Solution66_PlusOne {
    public static void main(String[] args){
        int[] digits = {9,8,9};
        int[] result = plusOne(digits);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    public static int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0){
            return new int[0];
        }

        for(int i = digits.length - 1; i >= 0; i --){
            if (digits[i] < 9){
                digits[i] ++;
                return digits;
            }else {
                digits[i] = 0;
            }
        }

        int[] result = new int[digits.length+1];
        result[0] = 1;

        return result;
    }
}
