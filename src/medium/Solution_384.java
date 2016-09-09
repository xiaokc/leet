package medium;

import java.util.Random;

/**
 * Created by xkc on 8/31/16.
 */
public class Solution_384 {
    int[] nums = null;
    Random random = null;
    public Solution_384(int[] nums) {
        this.nums = nums;
        this.random = new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
       if (nums == null){
           return null;
       }
        int[] a = nums.clone();
        for(int j = 1; j < a.length; j ++){
            int i = random.nextInt(j+1);
            swap(a,i,j);

        }
        return a;


    }

    public void swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
