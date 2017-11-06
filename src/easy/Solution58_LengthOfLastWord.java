package easy;

/**
 * 58. Length of Last Word  QuestionEditorial Solution  My Submissions
 * Total Accepted: 108039
 * Total Submissions: 356244
 * Difficulty: Easy
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
 * return the length of last word in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * <p>
 * For example,
 * Given s = "Hello World",
 * return 5.
 * Created by xkc on 9/3/16.
 */
public class Solution58_LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a "));
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        if (s.equalsIgnoreCase("") || s.length() == 0){
            return 0;
        }

        int space = 0;
        if (s.contains(" ")){
            space = s.lastIndexOf(" ");
            return s.substring(space+1, s.length()).length();
        }else {
            return s.length();
        }
    }

    public static int lengthOfLastWordBetter(String s){
        return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }
}
