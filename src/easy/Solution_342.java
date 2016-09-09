package easy;

/**
 * 342. Power of Four
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 * <p>
 * Example:
 * Given num = 16, return true. Given num = 5, return false.
 * <p>
 * Follow up: Could you solve it without loops/recursion?
 * Created by xkc on 8/21/16.
 */
public class Solution_342 {
    public static void main(String[] args){
        System.out.println(isPowerOfFour(16));
    }
    public static boolean isPowerOfFour(int num) {
        if (num == 1){
            return true;
        }
        String str = Integer.toBinaryString(num);
        if (str.charAt(0) != '1' || (str.length() % 2 == 0)){
            return false;
        }else{
            for (int i = 1; i < str.length(); i ++){
                if (str.charAt(i) != '0'){
                    return false;
                }
            }
        }
        return true;

    }

    public static boolean simpileMethod(int num){
        return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
        //0x55555555 is to get rid of those power of 2 but not power of 4
        //so that the single 1 bit always appears at the odd position
    }
}
