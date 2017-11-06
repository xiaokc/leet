package easy;

/**
 * power of three
 * 判断是否是3的幂
 * Created by xkc on 3/3/16.
 */
public class Solution_326 {
    public static void main(String[] args){
        boolean b = isPowerOfThree(31);
        System.out.println(b);
    }
    public static boolean isPowerOfThree(int n) {
       // 1162261467 is 3^19,  3^20 is bigger than int

        return  n >= 1 && 1162261467 % n == 0;

    }

    public static boolean method(int n){
        return n>0 && method(n/3);
    }
}
