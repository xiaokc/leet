package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Majority Element：出现次数超过［n/2］
 * tag:分治、数组、位运算
 * Created by xkc on 12/14/15.
 */
public class Solution_169 {
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i ++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]) + 1);
            }else {
                map.put(nums[i],1);
            }
        }

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            int num = (int) entry.getKey();
            int count = (int) entry.getValue();

            if (count > Math.floor(nums.length /2))
                return num;

        }

        return nums[0];
    }

    public static int majorityElement2(int[] nums){
        Arrays.sort(nums);//排序完后，出现次数大于n/2的元素一定是nums[nums.length/2]

        return nums[nums.length/2];
    }

}
