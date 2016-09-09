package easy;

/**
 * 14. Longest Common Prefix  QuestionEditorial Solution  My Submissions
 Total Accepted: 118863
 Total Submissions: 402520
 Difficulty: Easy
 Write a function to find the longest common prefix string amongst an array of strings.
 * Created by xkc on 9/4/16.
 */
public class Solution_14 {
    public static void main(String[] args){
        System.out.println(longestCommonPrefix(new String[]{"abcde","abcef","abcd","abcfed"}));
    }
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs == null || strs.length <= 0){
            return result;
        }
        int minSize = strs[0].length();
        int minIndex = 0;

        for (int i = 1; i < strs.length; i ++){
            if (strs[i].length() < minSize){
                minSize = strs[i].length();
                minIndex = i;

            }
        }

        for (int i = 0; i < strs.length; i ++){
            while (! strs[i].substring(0,minSize).equals(strs[minIndex].substring(0,minSize))){
                minSize --;
            }
            result = strs[minIndex].substring(0,minSize);
        }

        return result;

    }
}
