package easy;

/**
 * 26. Remove Duplicates from Sorted Array
 Given a sorted array, remove the duplicates in place such that each element appear only once
 and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 For example,
 Given input array nums = [1,1,2],

 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 It doesn't matter what you leave beyond the new length.
 * Created by xkc on 8/21/16.
 */
public class Solution26_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args){
        System.out.println(removeDuplicates(new int[]{1,1,2,3,3}));

    }
    public static int removeDuplicates(int[] nums) {
        int m = 0;
        for (int i = 1; i < nums.length; i ++){
            if (nums[i] != nums[i-1]){
                nums[++m] = nums[i];
            }
        }
        return m+1;

    }
}
