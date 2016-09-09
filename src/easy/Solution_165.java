package easy;

import java.util.Arrays;

/**
 * 165. Compare Version Numbers
 Compare two version numbers version1 and version2.
 If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

 You may assume that the version strings are non-empty and contain only digits and the . character.
 The . character does not represent a decimal point and is used to separate number sequences.
 For instance, 2.5 is not "two and a half" or "half way to version three",
 it is the fifth second-level revision of the second first-level revision.

 Here is an example of version numbers ordering:

 0.1 < 1.1 < 1.2 < 13.37
 * Created by xkc on 8/21/16.
 */
public class Solution_165 {
    public static void main(String[] args){
        System.out.println(compareVersion("01","1"));

    }
    public static int compareVersion(String version1, String version2) {
        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");

        int len = Math.min(str1.length,str2.length);

        for (int i = 0; i < len; i ++){
            if ( Integer.parseInt(str1[i]) > Integer.parseInt(str2[i]) ){
                return 1;
            }else if (Integer.parseInt(str1[i]) < Integer.parseInt(str2[i]) ){
                return -1;
            }
        }

        if (str1.length > str2.length && Integer.parseInt(str1[str1.length-1]) > 0 ){
            return 1;
        }else if (str1.length < str2.length && Integer.parseInt(str2[str2.length-1]) > 0){
            return -1;
        }else {
            return 0;
        }

    }


}
