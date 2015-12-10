package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum
 * Given an array of integers, find two numbers such that they add up to a specific target number.

 The function twoSum should return indices of the two numbers such that they add up to the target,
 where index1 must be less than index2.
 Please note that your returned answers (both index1 and index2) are not zero-based.

 You may assume that each input would have exactly one solution.
 * Created by xkc on 8/1/15.
 */
public class Solution_1 {
    public static void main(String[] args){
        int[] nums = {2,5,7,11};
        int[] indexs = method(nums, 9);
        System.out.println("index1="+indexs[0]+",index2="+indexs[1]);
    }


    /**
     * 已经AC，但是效率比较差
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    indexs[0] = i + 1;
                    indexs[1] = j + 1;
                }
            }
        }

        return indexs;
    }

    /**
     * 借助于HashMap，简单快捷
     * @param nums
     * @param target
     * @return
     */
    public static int[] method(int[] nums, int target){

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]) + 1, i + 1};
            }else {
                map.put(nums[i], i);
            }
        }

        return null;
    }

}
