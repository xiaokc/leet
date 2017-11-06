package easy;

import java.util.*;

/**
 * NO. 217
 * 判断数组中是否有重复元素
 * Created by xkc on 7/25/15.
 */
public class Solution217_ContainsDuplication {
    public static void main(String[] args) {
        int[] nums = {4,5,6,3,4};
        //boolean flag = containsDuplicate(nums);

       // boolean flag = c_lan_method(nums);
        boolean flag = method_3(nums);
        System.out.print(flag + "");
    }

    //使用HashSet
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    //蛮力解决，超时
    public static boolean c_lan_method(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (nums[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    //使用HashMap, containsValue 超时
    public static boolean method_2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsValue(nums[i])){
                return true;
            }
            map.put(i, nums[i]);

        }
        return false;
    }

    //使用HashMap containsKey AC
    public static boolean method_3(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],i);

        }
        return false;
    }


}
