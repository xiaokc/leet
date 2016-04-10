package easy;

/**
 * House Rob
 * 动态规划
 * Created by xkc on 3/21/16.
 */
public class Solution_198 {

    public static void main(String[] args) {
        System.out.println(test(new int[]{2, 1, 1, 2}));
    }

    //类似于动态规划的解决方法
    public static int rob(int[] nums) {
        int evenRes = 0;
        int oddRes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 1) {
                oddRes = Math.max(oddRes + nums[i], evenRes);
            } else {
                evenRes = Math.max(evenRes + nums[i], oddRes);
            }
        }

        return Math.max(evenRes, oddRes);
    }

    public static int test(int[] nums){
        int[] d = new int[nums.length];
        d[0] = nums[0];
        d[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i ++){
            d[i] = Math.max(d[i-2]+nums[i], d[i-1]);
        }
        return d[nums.length-1];
    }


    //动态规划方法
    public static int dynamicProgram(int[] nums) {
        int[][] dp = new int[nums.length + 1][2];
        for (int i = 1; i <= nums.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = nums[i - 1] + dp[i - 1][0];
        }

        return Math.max(dp[nums.length][0], dp[nums.length][1]);

    }

    //将动态规划的空间复杂度降低到O(1)
    public static int betterDynamicProgram(int[] nums) {
        int preNo = 0;
        int preYes = 0;
        for (int n : nums) {
            int temp = preNo;
            preNo = Math.max(preNo,preYes);
            preYes = n + temp;

        }

        return Math.max(preNo,preYes);
    }

}
