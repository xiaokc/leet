package easy;

/**
 * 172. Factorial Trailing Zeroes  QuestionEditorial Solution  My Submissions
 Total Accepted: 68947
 Total Submissions: 203458
 Difficulty: Easy
 Given an integer n, return the number of trailing zeroes in n!.

 Note: Your solution should be in logarithmic time complexity.
 * Created by xkc on 8/25/16.
 */
public class Solution172_FactorialTrailingZeroes {
    public static void main(String[] args){
        System.out.println(factory(13));
    }
    public static int trailingZeroes(int n) {
        int fact = factory(n);
        int count = 0;
        while (fact != 0){
            if (fact % 10 == 0){
                count ++;
                fact /= 10;
            }else {
                fact = 0;
            }

        }
        return count;

    }

    private static int factory(int n){
        int result = 1;
        if (n <= 1){
            return result;
        }else {
            while (n > 1){
                result *= n;
                n --;
            }
        }
        return result;
    }

    //奇技淫巧
    public static int trailingZeroes_ac(int n){
        return n == 0 ? 0 : n/5 + trailingZeroes_ac(n/5);
    }
}
