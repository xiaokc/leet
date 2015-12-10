package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Three Sum Triplet
 * Created by xkc on 9/1/15.
 */
public class Solution_15 {
    public static void main(String[] args){

    }


    /**
     * 两个数相加 TwoSum
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target){

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
