package easy;

/**
 * NO. 7 Reverse digits of an integer.
 * Created by xkc on 7/25/15.
 */
public class Solution_7 {
    public static void main(String[] args){
        System.out.print(reverse(123));
    }

    public static int reverse(int x) {
       long result = 0;
        while(x != 0){
            result = result * 10 + x % 10;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
                return 0;
            }

            x /= 10;
        }

        return (int) result;

    }

}
