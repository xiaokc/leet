package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. Generate Parentheses  QuestionEditorial Solution  My Submissions
 * Total Accepted: 103525
 * Total Submissions: 263101
 * Difficulty: Medium
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * <p>
 * For example, given n = 3, a solution set is:
 * <p>
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 * Created by xkc on 9/3/16.
 */
public class Solution_22 {
    public static void main(String[] args){
        List<String> list = generateParenthesis(5);
        System.out.println(list.size());
        for (String s:list){
            System.out.println(s);
        }
    }
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list,"",0,0,n);
        return list;


    }

    /**
     * 太厉害的回溯法啦
     * @param list
     * @param str
     * @param open
     * @param close
     * @param max
     */
    public static void backtrack(List<String> list, String str, int open, int close, int max) {
        if (str.length() == max * 2) {
            list.add(str);
            return;
        }

        if (open < max) {
            backtrack(list, str + "(", open + 1, close, max);
        }

        if (close < open) {
            backtrack(list, str + ")", open, close + 1, max);
        }
    }
}
