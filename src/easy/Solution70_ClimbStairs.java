package easy;

/**
 * Created by xkc on 2/25/16.
 * Climbing Stairs
 * description:
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class Solution70_ClimbStairs {

    //动态规划，使用递归超时
    public static int climbStairsByRecurvise(int n){
        if (n <= 0 || n == 1 || n == 2) {
            return n;
        }else {
            return climbStairsByRecurvise(n - 1) + climbStairsByRecurvise(n - 2);
        }
    }

    public static int climbStarisByFibonacci(int n){
        if (n <= 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }

        int a = 1;
        int b = 2;
        int c = 0;

        for (int i = 2; i < n; i ++){
            c = a + b;
            a = b;
            b = c;

        }
        return c;

    }

    public static int climbStairs(int n) {
        if (n <= 0 || n == 1 || n == 2) {
            return n;
        } else {
            int[] ways = new int[n];
            ways[0] = 1;
            ways[1] = 2;
            for (int i = 2; i < n; i++) {
                ways[i] = ways[i - 1] + ways[i - 2];
            }
            return ways[n - 1];
        }
    }



    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}
