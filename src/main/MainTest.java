package main;

import easy.Solution_292;
import hard.Solution_4;
import medium.Solution_5;

/**
 * Created by xkc on 12/4/15.
 */
public class MainTest {
    public static void main(String[] args){
//        int[] nums1={2,3,4};
//        int[] nums2 = {1};
//
////        double ans = Solution_4.findMedianSortedArrays(nums1,nums2);
////        System.out.println("ans=" + ans);
//
//
//        String string = Solution_5.longestPalindrome("abcdcbbd");
//        System.out.println(string);

        boolean canWind = Solution_292.canWinNim(5);
        System.out.println(canWind);

    }
}
