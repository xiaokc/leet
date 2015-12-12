package easy;

/**
 * 将一个数组中的0移动到最后，其它元素的相对位置保持不变
 * Created by xkc on 12/11/15.
 */
public class Solution_283 {

    public static void moveZeroes(int[] nums) {
        int end = nums.length-1;
        for(int i = end; i >= 0; i --){
            if (nums[i] == 0){
                int j;
                for(j = i; j < end; j ++){
                    nums[j] = nums[j+1];
                }
                nums[j] = 0;
            }
        }

        for (int i =0; i <= end; i ++){
            System.out.println(nums[i]);
        }

    }

    //讨论区大神的代码，1ms
    public void moveZeros2(int[] nums){
        int j =0;
        for (int i =0; i < nums.length; i ++){
            if (nums[i] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }


}
