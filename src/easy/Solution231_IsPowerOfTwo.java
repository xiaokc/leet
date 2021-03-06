package easy;

/**
 * Power of two
 * Created by xkc on 7/27/15.
 */
public class Solution231_IsPowerOfTwo {
    public static void main(String[] args) {
        System.out.print(isPowerOfTwo(8));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0){
            return false;
        }
        if (n == 1){
            return true;
        }
        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n >>>1;
        }
        return true;
    }

    public static boolean simpleMethod(int n){
        return n > 0 && (n & (n - 1)) == 0;
    }
}
